## Introduction

A Java starter application for writing microservices using Lambda and SQS.

The template will do the following:
- Create a new Lambda function with Java as its runtime.
- Create a new SQS queue.
- Create custom IAM role and permissions to allow the Lambda function to interact with SQS and CloudWatch.


## How to use

#### From AWS Console
1. Login to AWS console and go to Lambda.
2. Go to `Applications` and Click on `Create application`.
3. Select `Serverless application` tab.
4. Search for `java-microservices-starter` under Public applications. *Ensure to show apps that creates custom IAM roles*.
5. Follow the on screen instructions and deploy the application.

#### From SAM CLI
1. From the project root, run `sam build` and then `sam deploy --guided`.
