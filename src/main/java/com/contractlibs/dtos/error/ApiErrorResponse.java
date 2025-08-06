package com.contractlibs.dtos.error;


import java.time.LocalDateTime;
import java.util.List;

/**
 * A standard structure for returning error details from APIs.
 *
 * <p>Usage example:
 * <pre>
 * ApiError error = ApiError.builder()
 *     .timestamp(LocalDateTime.now())
 *     .status(400)
 *     .error("Bad Request")
 *     .message("Validation failed")
 *     .path("/api/users")
 *     .errors(List.of("Email is required", "Password must be at least 8 characters"))
 *     .build();
 * </pre>
 */
public class ApiErrorResponse {

    /** The timestamp when the error occurred. */
    private final LocalDateTime timestamp;

    /** HTTP status code (e.g., 400, 404, 500). */
    private final int status;

    /** The error summary (e.g., "Bad Request", "Internal Server Error"). */
    private final String error;

    /** Detailed message to help understand the issue. */
    private final String message;

    /** The path or endpoint where the error occurred. */
    private final String path;

    /** Optional list of specific errors (e.g., validation issues). */
    private final List<String> errors;

    private ApiErrorResponse(Builder builder) {
        this.timestamp = builder.timestamp;
        this.status = builder.status;
        this.error = builder.error;
        this.message = builder.message;
        this.path = builder.path;
        this.errors = builder.errors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private LocalDateTime timestamp;
        private int status;
        private String error;
        private String message;
        private String path;
        private List<String> errors;

        public Builder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder error(String error) {
            this.error = error;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder errors(List<String> errors) {
            this.errors = errors;
            return this;
        }

        public ApiErrorResponse build() {
            return new ApiErrorResponse(this);
        }
    }

    // Getters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public List<String> getErrors() {
        return errors;
    }
}

