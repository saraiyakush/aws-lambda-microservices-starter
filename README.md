## Introduction

A Java starter application for writing microservices using Lambda and SQS.

The template will do the following:
- Create a new Lambda function with Java 11 its as runtime.
- Create the necessary IAM role and permissions to interact with SQS and CloudWatch.


## Prerequisites

- An existing SQS queue


## How to use

#### From AWS Console
1. Login to AWS console and go to Lambda.
2. Click on `Create Function`.
3. Select `Browse serverless app repository`.
4. Search for `java-microservices-starter` under Public applications.
5. Follow the on screen instructions.

#### From SAM CLI
1. From the project root, run `sam build` and then `sam deploy --guided`.
