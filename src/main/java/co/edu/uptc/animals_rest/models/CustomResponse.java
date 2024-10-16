package co.edu.uptc.animals_rest.models;

import java.time.LocalDateTime;

public class CustomResponse<T> {
    private String containerName;
    private LocalDateTime timestamp;
    private T data;

    public CustomResponse(T data) {
        this.data = data;
        this.containerName = System.getenv("HOSTNAME");
        this.timestamp = LocalDateTime.now();
    }

    public String getContainerName() {
        return containerName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public T getData() {
        return data;
    }
}
