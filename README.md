# WhatsApp Chatbot Backend

A simple backend chatbot simulation built with **Spring Boot** and **Java 17**.  
This project demonstrates REST API development, logging, exception handling, and deployment on Render.

---

## 🚀 How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/Suraj0242/whatsapp-chatbot-backend.git
   cd whatsapp-chatbot-backend
2. Build the project:
./mvnw clean package
3. 	Run the JAR:
   java -jar target/whatsappChatbot-0.0.1-SNAPSHOT.jar
4. 	Access locally:
   http://localhost:8080/webhook
 Deployment
The project is deployed on Render:https://whatsapp-chatbot-backend-0evc.onrender.com
👉 Live Demo:  (whatsapp-chatbot-backend-0evc.onrender.com in Bing)
API Example
POST /webhook
Request:
{
  "message": "Hi"
}

Response:
"Hello"

Author
Suraj Kumar
Aspiring Backend Engineer | Spring Boot & MySQL Enthusiast

