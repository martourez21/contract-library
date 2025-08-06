package com.contractlibs;

/**
 * Contract Library Documentation
 * <p>
 * The <strong>Contract Library</strong> is a lightweight, modular, and extensible Java library that provides
 * reusable components for managing contract-based systems such as account handling, domain events,
 * status tracking, and business-level enumeration constants.
 * </p>
 *
 * <p><strong>Version:</strong> 1.0.0</p>
 * <p><strong>Author:</strong> 6-Bank Organization</p>
 *
 * <h2>Package Overview</h2>
 * <ul>
 *     <li><strong>com.contractlibs.dto</strong> – Data Transfer Objects for standardized API communication.
 *         <ul>
 *             <li>{@code ApiResponse} – Generic success response wrapper.</li>
 *             <li>{@code ApiError} – Standardized error payload for exception handling.</li>
 *         </ul>
 *     </li>
 *     <li><strong>com.contractlibs.enums</strong> – Enumerations that represent various domain concepts.
 *         <ul>
 *             <li>{@code AccountType} – Defines types like SAVINGS, CURRENT, etc.</li>
 *             <li>{@code AccountStatus} – Tracks account states such as ACTIVE, INACTIVE, BLOCKED.</li>
 *             <li>{@code LimitType} – Represents transaction limits like DAILY, MONTHLY, etc.</li>
 *         </ul>
 *     </li>
 *     <li><strong>com.contractlibs.events</strong> – Domain events that support eventual consistency and communication.
 *         <ul>
 *             <li>{@code AccountCreatedEvent}</li>
 *             <li>{@code AccountStatusChangedEvent}</li>
 *         </ul>
 *     </li>
 *     <li><strong>com.contractlibs.utility</strong> – Utility and helper classes.
 *         <ul>
 *             <li>{@code AccountNumberGenerator} – Static helper to generate and validate account numbers.</li>
 *         </ul>
 *     </li>
 * </ul>
 *
 * <h2>Usage Example</h2>
 *
 * <pre>{@code
 * ApiResponse<String> response = ApiResponse.<String>builder()
 *     .status(200)
 *     .message("Account created successfully")
 *     .data("123456")
 *     .build();
 *
 * AccountType type = AccountType.SAVINGS;
 * }</pre>
 *
 * <h2>Purpose</h2>
 * <p>
 * This library is designed for internal or external engineering teams who aim to:
 * </p>
 * <ul>
 *   <li>Maintain consistency across account-related microservices</li>
 *   <li>Leverage reusable enums, DTOs, and domain events</li>
 *   <li>Reduce boilerplate and accelerate backend service development</li>
 * </ul>
 */
public final class LibraryDocumentation {

    private LibraryDocumentation() {
        // Prevent instantiation
    }
}
