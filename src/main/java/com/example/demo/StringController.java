package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    private ReceivedData receivedData = new ReceivedData();

    @PostMapping("/sendString")
    public ResponseEntity<String> receiveString(@RequestBody ReceivedData requestData) {
        receivedData.setReceivedString(requestData.getReceivedString());

        // 在控制台上打印接收到的字符串
        System.out.println("Received String: " + receivedData.getReceivedString());

        // 在这里添加将字符串发送到ESP32的代码

        // 返回确认消息
        return ResponseEntity.ok("String received successfully");
    }

    @GetMapping("/show")
    public ResponseEntity<ReceivedData> showString() {
        return ResponseEntity.ok(receivedData);
    }
}
