**Project requirements**

Develop a Java Spring Boot project (you can use https://start.spring.io/) that has an endpoint “concatenate” which is a POST that can accept 2 Strings as parameters in the URL (query parameters) and whose response is a String with these 2 parameters concatenated. That is, if we POST to https://localhost:8080/api/concatenate?left=abc&right=def, the response should be abcdef or a JSON that contains "abcdef" (for example, { "result": "abcdef" }).
When you have created this endpoint, you should demonstrate that you can call it, for example, using Postman, and show that it works.

Develop an Angular project that contains a form with 2 inputs “Left” and “Right”, a submit button, and a textarea. When the submit button is pressed, it should call the previously developed endpoint and display the result in the textarea.
When you have created this form, you should demonstrate that it works in a browser.

Note: Make sure to handle any possible errors when calling the endpoint and display an appropriate message in the textarea.

You have 1 hour to complete the test.

Within 2 hours, you must have replied to this email and send a link with the recording (you can upload it to YouTube, Drive, or any cloud tool). In the recording, please show:

The configuration of the Spring Boot project.
The configuration of the Angular project.
The tests of the endpoint in Postman.
The tests of the form in the browser.
