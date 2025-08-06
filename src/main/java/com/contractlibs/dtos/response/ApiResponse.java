package com.contractlibs.dtos.response;

import java.time.LocalDateTime;

/**
 * A generic response wrapper for successful API responses.
 *
 * <p>Usage example:
 * <pre>
 * ApiResponse&lt;UserDto&gt; response = ApiResponse.&lt;UserDto&gt;builder()
 *     .timestamp(LocalDateTime.now())
 *     .status(200)
 *     .message("User fetched successfully")
 *     .data(userDto)
 *     .build();
 * </pre>
 *
 * @param <T> The type of the data payload in the response.
 */
public class ApiResponse<T> {

    /** The timestamp when the response was generated. */
    private final LocalDateTime timestamp;

    /** HTTP status code (e.g., 200 for success). */
    private final int status;

    /** A human-readable message describing the result. */
    private final String message;

    /** The response payload of type T. */
    private final T data;

    private ApiResponse(Builder<T> builder) {
        this.timestamp = builder.timestamp;
        this.status = builder.status;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    public static class Builder<T> {
        private LocalDateTime timestamp;
        private int status;
        private String message;
        private T data;

        public Builder<T> timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder<T> status(int status) {
            this.status = status;
            return this;
        }

        public Builder<T> message(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

        public ApiResponse<T> build() {
            return new ApiResponse<>(this);
        }
    }

    // Getters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
