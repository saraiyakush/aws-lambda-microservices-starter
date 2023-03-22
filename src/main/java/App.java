import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSBatchResponse;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import java.util.List;
import java.util.stream.Collectors;

public class App implements RequestHandler<SQSEvent, SQSBatchResponse> {

  private MessageProcessor messageProcessor; // Initialize with an implementation

  private List<SQSBatchResponse.BatchItemFailure> buildResponse(
      List<SQSEvent.SQSMessage> sqsMessages) {

    return sqsMessages.stream()
        .map(sqsMessage -> new SQSBatchResponse.BatchItemFailure(sqsMessage.getMessageId()))
        .collect(Collectors.toList());
  }

  @Override
  public SQSBatchResponse handleRequest(SQSEvent sqsEvent, Context context) {

    List<SQSEvent.SQSMessage> failedMessages = messageProcessor.processBatch(sqsEvent.getRecords());

    return new SQSBatchResponse(buildResponse(failedMessages));
  }
}
