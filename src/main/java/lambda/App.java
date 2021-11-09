package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

public class App implements RequestHandler<SQSEvent, String> {


    @Override
    public String handleRequest(SQSEvent sqsEvent, Context context) {
        return "SUCCESS";
    }
}
