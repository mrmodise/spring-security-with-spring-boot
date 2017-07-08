### Spring Security With Spring Boot
Secure a Spring Boot Web app using Spring security: user credentials from relational database

### Overview
A simple way to add security to your Java Spring Boot application

### Requirements
- Internet connect to download Maven dependencies
- An understanding of Spring security
- Spring Tool Suite (STS)

### Setup
- Clone the project or download the zip to your preferred location in your computer
- Open the project in STS, right-click on the project Maven -> update project
- Alternatively on terminal run ```mvn package```

### Manual Testing
- Once the project has been fully loaded into STS, right-click then run as Spring Boot App
- Open your browser and navigate to http://localhost:8080/ where you will be presented with a login menu
- Enter username as nonadmin@gmail.com and password as ``password``


### Further Testing

Switch between user ```nonadmin@gmail.com`` and ```admin@gmail.com```.

Observe the differences in the presented information in the UI

Note: nonadmin@gmail.com user will not have access to the admin content.


### License
```
The MIT License (MIT)

Copyright (c) 2016 Mr Modise

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
