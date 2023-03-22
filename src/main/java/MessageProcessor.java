import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import java.util.List;

public interface MessageProcessor {

  /**
   * Process a batch of messages.
   *
   * @param sqsMessages List of messages to be processed.
   * @return List of failed messages.
   *     <p>In case of FIFO, stop processing messages after the first failure and return all failed
   *     and unprocessed messages to preserve ordering.
   */
  List<SQSEvent.SQSMessage> processBatch(List<SQSEvent.SQSMessage> sqsMessages);
}
