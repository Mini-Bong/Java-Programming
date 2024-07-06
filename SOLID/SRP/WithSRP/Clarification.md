What is the problem with this design? This answer is that It violates the SRP here. You can see that displaying an employee detail, generating an employee id, or checking a seniority level are all different activities. Since I put everything in a single class, I may face problems adopting new changes in the future. Here are some possible reasons:

1. The top management can set a different criterion to decide a seniority level.

2. They can also use a complex algorithm to generate the employee id.

In each case, I’ll need to modify the Employee class. Now you understand that it is better to follow the SRP and separate these activities.