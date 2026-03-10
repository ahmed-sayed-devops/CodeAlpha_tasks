# 🚀 CodeAlpha Jenkins Remoting CI/CD Pipeline

## 🧩 Overview

This project demonstrates a **complete CI/CD pipeline using Jenkins with a remote AWS EC2 agent**.

The pipeline automatically builds, containerizes, and deploys a **Spring Boot application** using Docker.
The pipeline is triggered automatically using **GitHub Webhooks**, and notifications are sent to **Slack** after every build.

### Key Features

* Jenkins Controller + **Remote AWS EC2 Agent**
* Automated **CI/CD pipeline**
* **Maven build** for Java application
* **Docker image build & push** to Docker Hub
* **Automatic container deployment**
* **Slack notifications** for build status
* **GitHub Webhook integration**

---

# 🏗 Architecture

GitHub Push → Jenkins Pipeline → AWS EC2 Agent → Build (Maven) → Docker Image → DockerHub → Deploy Container → Slack Notification

---

# 📁 Project Structure

```
CodeAlpha_Jenkins_Remoting_CICD
│
├── src/main/java
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
```

---

# ⚙ CI/CD Pipeline Stages

The Jenkins pipeline performs the following steps:

1️⃣ Checkout source code from GitHub
2️⃣ Build the Java application using Maven
3️⃣ Build Docker image
4️⃣ Push Docker image to Docker Hub
5️⃣ Deploy the container
6️⃣ Send build notification to Slack

---

# 📸 Project Screenshots

| Step | Description                                                         | Screenshot                                                         |
| ---- | ------------------------------------------------------------------- | ------------------------------------------------------------------ |
| 1    | Jenkins agent successfully connected to controller                  | ![Agent Online](screenshots/01-agent-is-online.png)                |
| 2    | Jenkins remoting connection log for the AWS EC2 agent               | ![Agent Connection](screenshots/02-connect-agent.png)              |
| 3    | Configured Jenkins credentials for GitHub, DockerHub, AWS and Slack | ![Credentials](screenshots/03-credentails.png)                     |
| 4    | Jenkins pipeline configured with GitHub repository                  | ![Pipeline Config](screenshots/04-configure-pipeline.png)          |
| 5    | Jenkins pipeline successfully created                               | ![Pipeline Created](screenshots/05-pipeline-created.png)           |
| 6    | GitHub webhook configuration pointing to Jenkins                    | ![Webhook Config](screenshots/06-configure-GHwebhook.png)          |
| 7    | Webhook successfully tested from GitHub                             | ![Webhook Test](screenshots/07-test-webhook.png)                   |
| 8    | Jenkinsfile pushed to GitHub repository                             | ![Push Jenkinsfile](screenshots/08-push-jenkinsfile.png)           |
| 9    | Pipeline triggered automatically after GitHub push                  | ![Pipeline Trigger](screenshots/09-pipeline-start.png)             |
| 10   | Jenkins pipeline running                                            | ![Pipeline Progress](screenshots/10-pipeline-in-progress.png)      |
| 11   | Build scheduled on AWS EC2 Jenkins agent                            | ![Build on Agent](screenshots/11-build-scheduled-in-aws-agent.png) |
| 12   | Agent hostname verification inside pipeline                         | ![Agent Hostname](screenshots/12-agent-hostname.png)               |
| 13   | Jenkins pipeline completed successfully                             | ![Pipeline Success](screenshots/13-pipeline-success.png)           |
| 14   | Docker image pushed successfully to DockerHub                       | ![Docker Push](screenshots/14-image-pushed.png)                    |
| 15   | Docker image versions visible in DockerHub repository               | ![Image Versions](screenshots/15-image-versions.png)               |
| 16   | Docker container running on the server                              | ![Running Container](screenshots/16-cont-running.png)              |
| 17   | Slack notification for pipeline status                              | ![Slack Notification](screenshots/17-slack-notification.png)       |
| 18   | Accessing deployed application from browser                         | ![Access Application](screenshots/18-access-app.png)               |

---

# ▶ How to Run the Application

1. Clone the repository

```
git clone https://github.com/ahmed-sayed-devops/CodeAlpha_tasks.git
```

2. Navigate to the project directory

```
cd CodeAlpha_Jenkins_Remoting_CICD
```

3. Build the Docker image

```
docker build -t codealpha-jenkins-demo .
```

4. Run the container

```
docker run -d -p 8081:8080 codealpha-jenkins-demo
```

5. Access the application

```
http://SERVER_PUBLIC_IP:8081
```

---

# 🐳 Docker Image

DockerHub Repository:

```
a7medsayed/codealpha-jenkins-demo
```

---

# 🔔 Slack Notification

The pipeline sends automatic notifications to Slack channel **#jenkins-ci** when:

* Build succeeds
* Build fails

---

# 👨‍💻 Author

Ahmed Sayed Abd Elbaseer

GitHub
https://github.com/ahmed-sayed-devops

LinkedIn
https://www.linkedin.com/in/ahmed-sayed-devops

---

# 📜 License

This project is part of the **CodeAlpha DevOps Internship Program**.
