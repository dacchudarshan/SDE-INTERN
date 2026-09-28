import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * ============================================================
 *              ADVANCED E-COMMERCE BACKEND
 * ============================================================
 *
 * Java concepts covered:
 *
 * 1. Classes and Objects
 * 2. Encapsulation
 * 3. Inheritance
 * 4. Abstraction
 * 5. Interfaces
 * 6. Polymorphism
 * 7. Method Overloading
 * 8. Method Overriding
 * 9. Collections
 * 10. Generics
 * 11. Enums
 * 12. Custom Exceptions
 * 13. Lambda Expressions
 * 14. Stream API
 * 15. Optional
 * 16. File Handling
 * 17. Serialization
 * 18. Multithreading
 * 19. ExecutorService
 * 20. AtomicInteger
 * 21. Comparable
 * 22. Comparator
 * 23. Predicate
 * 24. Date and Time API
 * 25. Design Patterns
 *
 * Compile:
 *
 * javac ECommerceApplication.java
 *
 * Run:
 *
 * java ECommerceApplication
 *
 * ============================================================
 */


/* ============================================================
                         ENUMS
   ============================================================ */

enum ProductCategory {
    ELECTRONICS,
    CLOTHING,
    BOOKS,
    HOME,
    BEAUTY,
    SPORTS,
    GROCERY,
    TOYS
}

enum ProductStatus {
    ACTIVE,
    INACTIVE,
    OUT_OF_STOCK,
    DISCONTINUED
}

enum OrderStatus {
    CREATED,
    CONFIRMED,
    PROCESSING,
    SHIPPED,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELLED,
    RETURNED
}

enum PaymentStatus {
    PENDING,
    SUCCESS,
    FAILED,
    REFUNDED
}

enum PaymentMethod {
    CREDIT_CARD,
    DEBIT_CARD,
    UPI,
    NET_BANKING,
    CASH_ON_DELIVERY,
    WALLET
}

enum UserRole {
    CUSTOMER,
    ADMIN,
    SELLER
}

enum DiscountType {
    PERCENTAGE,
    FIXED_AMOUNT
}

enum DeliveryStatus {
    NOT_ASSIGNED,
    ASSIGNED,
    PICKED_UP,
    IN_TRANSIT,
    DELIVERED
}


/* ============================================================
                       CUSTOM EXCEPTIONS
   ============================================================ */

class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String message) {
        super(message);
    }
}


class InsufficientStockException extends Exception {

    public InsufficientStockException(String message) {
        super(message);
    }
}


class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }
}


class OrderNotFoundException extends Exception {

    public OrderNotFoundException(String message) {
        super(message);
    }
}


class PaymentFailedException extends Exception {

    public PaymentFailedException(String message) {
        super(message);
    }
}


class InvalidCouponException extends Exception {

    public InvalidCouponException(String message) {
        super(message);
    }
}


class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}


/* ============================================================
                         LOGGER
   ============================================================ */

class Logger {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void info(String message) {

        System.out.println(
                "[" + LocalDateTime.now().format(FORMATTER) +
                "] [INFO] " + message
        );
    }

    public static void error(String message) {

        System.out.println(
                "[" + LocalDateTime.now().format(FORMATTER) +
                "] [ERROR] " + message
        );
    }

    public static void warning(String message) {

        System.out.println(
                "[" + LocalDateTime.now().format(FORMATTER) +
                "] [WARNING] " + message
        );
    }
}


/* ============================================================
                      ADDRESS CLASS
   ============================================================ */

class Address implements Serializable {

    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String pincode;
    private String country;

    public Address(
            String houseNumber,
            String street,
            String city,
            String state,
            String pincode,
            String country) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {

        return houseNumber + ", " +
                street + ", " +
                city + ", " +
                state + " - " +
                pincode + ", " +
                country;
    }
}


/* ============================================================
                         USER CLASS
   ============================================================ */

class User implements Serializable {

    private int id;
    private String name;
    private String email;
    private String password;
    private String phone;

    private UserRole role;

    private List<Address> addresses;

    private LocalDateTime createdAt;

    public User(
            int id,
            String name,
            String email,
            String password,
            String phone,
            UserRole role) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;

        this.addresses = new ArrayList<>();

        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public UserRole getRole() {
        return role;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void addAddress(Address address) {

        addresses.add(address);

        Logger.info(
                "Address added for user " + name
        );
    }

    public boolean authenticate(String password) {

        return this.password.equals(password);
    }

    public void changePassword(String newPassword) {

        this.password = newPassword;

        Logger.info(
                "Password changed for user " + name
        );
    }

    @Override
    public String toString() {

        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }
}


/* ============================================================
                       PRODUCT CLASS
   ============================================================ */

class Product implements Serializable, Comparable<Product> {

    private int id;

    private String name;

    private String description;

    private double price;

    private int stock;

    private ProductCategory category;

    private ProductStatus status;

    private double rating;

    private int totalReviews;

    private String brand;

    private LocalDateTime createdAt;

    public Product(
            int id,
            String name,
            String description,
            double price,
            int stock,
            ProductCategory category,
            String brand) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.brand = brand;

        this.status = stock > 0
                ? ProductStatus.ACTIVE
                : ProductStatus.OUT_OF_STOCK;

        this.rating = 0.0;

        this.totalReviews = 0;

        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public synchronized void increaseStock(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be positive"
            );
        }

        stock += quantity;

        status = ProductStatus.ACTIVE;

        Logger.info(
                quantity + " units added to " + name
        );
    }

    public synchronized void decreaseStock(int quantity)
            throws InsufficientStockException {

        if (quantity <= 0) {

            throw new IllegalArgumentException(
                    "Quantity must be positive"
            );
        }

        if (quantity > stock) {

            throw new InsufficientStockException(
                    "Insufficient stock for " + name
            );
        }

        stock -= quantity;

        if (stock == 0) {

            status = ProductStatus.OUT_OF_STOCK;
        }
    }

    public void updatePrice(double newPrice) {

        if (newPrice < 0) {

            throw new IllegalArgumentException(
                    "Price cannot be negative"
            );
        }

        this.price = newPrice;
    }

    public void addRating(double rating) {

        if (rating < 1 || rating > 5) {

            throw new IllegalArgumentException(
                    "Rating must be between 1 and 5"
            );
        }

        double total =
                this.rating * this.totalReviews;

        this.totalReviews++;

        this.rating =
                (total + rating) / this.totalReviews;
    }

    public boolean matches(String keyword) {

        String lower =
                keyword.toLowerCase();

        return name.toLowerCase().contains(lower)
                || description.toLowerCase().contains(lower)
                || brand.toLowerCase().contains(lower);
    }

    @Override
    public int compareTo(Product other) {

        return this.name.compareToIgnoreCase(
                other.name
        );
    }

    @Override
    public String toString() {

        return String.format(
                "Product{id=%d, name='%s', price=%.2f, stock=%d, category=%s, rating=%.2f}",
                id,
                name,
                price,
                stock,
                category,
                rating
        );
    }
}


/* ============================================================
                     CART ITEM CLASS
   ============================================================ */

class CartItem implements Serializable {

    private Product product;

    private int quantity;

    public CartItem(Product product, int quantity) {

        this.product = product;

        if (quantity <= 0) {

            throw new IllegalArgumentException(
                    "Quantity must be positive"
            );
        }

        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int quantity) {

        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {

        if (quantity >= this.quantity) {

            this.quantity = 0;

        } else {

            this.quantity -= quantity;
        }
    }

    public double getSubtotal() {

        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {

        return product.getName() +
                " x " +
                quantity +
                " = ₹" +
                getSubtotal();
    }
}


/* ============================================================
                          CART CLASS
   ============================================================ */

class Cart implements Serializable {

    private int userId;

    private Map<Integer, CartItem> items;

    public Cart(int userId) {

        this.userId = userId;

        this.items = new LinkedHashMap<>();
    }

    public int getUserId() {
        return userId;
    }

    public Map<Integer, CartItem> getItems() {
        return items;
    }

    public void addProduct(
            Product product,
            int quantity)
            throws InsufficientStockException {

        if (quantity <= 0) {

            throw new IllegalArgumentException(
                    "Quantity must be positive"
            );
        }

        CartItem existing =
                items.get(product.getId());

        int currentQuantity =
                existing == null
                        ? 0
                        : existing.getQuantity();

        if (currentQuantity + quantity >
                product.getStock()) {

            throw new InsufficientStockException(
                    "Not enough stock for " +
                    product.getName()
            );
        }

        if (existing == null) {

            items.put(
                    product.getId(),
                    new CartItem(
                            product,
                            quantity
                    )
            );

        } else {

            existing.increaseQuantity(quantity);
        }

        Logger.info(
                "Product added to cart: " +
                product.getName()
        );
    }

    public void removeProduct(int productId) {

        items.remove(productId);

        Logger.info(
                "Product removed from cart"
        );
    }

    public double calculateTotal() {

        return items.values()
                .stream()
                .mapToDouble(
                        CartItem::getSubtotal
                )
                .sum();
    }

    public int getTotalItems() {

        return items.values()
                .stream()
                .mapToInt(
                        CartItem::getQuantity
                )
                .sum();
    }

    public boolean isEmpty() {

        return items.isEmpty();
    }

    public void clear() {

        items.clear();
    }

    public void printCart() {

        System.out.println(
                "\n========== CART =========="
        );

        if (items.isEmpty()) {

            System.out.println(
                    "Cart is empty"
            );

            return;
        }

        items.values()
                .forEach(
                        item -> System.out.println(
                                item
                        )
                );

        System.out.println(
                "Total Items: " +
                getTotalItems()
        );

        System.out.println(
                "Total: ₹" +
                calculateTotal()
        );
    }
}


/* ============================================================
                      COUPON CLASS
   ============================================================ */

class Coupon implements Serializable {

    private String code;

    private DiscountType type;

    private double value;

    private double minimumOrderValue;

    private LocalDateTime expiry;

    private int usageLimit;

    private int usedCount;

    public Coupon(
            String code,
            DiscountType type,
            double value,
            double minimumOrderValue,
            LocalDateTime expiry,
            int usageLimit) {

        this.code = code;

        this.type = type;

        this.value = value;

        this.minimumOrderValue =
                minimumOrderValue;

        this.expiry = expiry;

        this.usageLimit = usageLimit;

        this.usedCount = 0;
    }

    public String getCode() {
        return code;
    }

    public boolean isValid(double orderValue) {

        return LocalDateTime.now()
                .isBefore(expiry)

                && usedCount < usageLimit

                && orderValue >= minimumOrderValue;
    }

    public double calculateDiscount(
            double orderValue)
            throws InvalidCouponException {

        if (!isValid(orderValue)) {

            throw new InvalidCouponException(
                    "Coupon is invalid or expired"
            );
        }

        if (type == DiscountType.PERCENTAGE) {

            return orderValue *
                    value / 100.0;
        }

        return Math.min(
                value,
                orderValue
        );
    }

    public void markUsed() {

        usedCount++;
    }

    @Override
    public String toString() {

        return code +
                " - " +
                type +
                " - " +
                value;
    }
}


/* ============================================================
                       REVIEW CLASS
   ============================================================ */

class Review implements Serializable {

    private int userId;

    private int productId;

    private int rating;

    private String comment;

    private LocalDateTime createdAt;

    public Review(
            int userId,
            int productId,
            int rating,
            String comment) {

        if (rating < 1 || rating > 5) {

            throw new IllegalArgumentException(
                    "Rating must be 1-5"
            );
        }

        this.userId = userId;

        this.productId = productId;

        this.rating = rating;

        this.comment = comment;

        this.createdAt = LocalDateTime.now();
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {

        return "Rating: " +
                rating +
                "/5 | " +
                comment;
    }
}


/* ============================================================
                     ORDER ITEM CLASS
   ============================================================ */

class OrderItem implements Serializable {

    private int productId;

    private String productName;

    private double price;

    private int quantity;

    public OrderItem(
            int productId,
            String productName,
            double price,
            int quantity) {

        this.productId = productId;

        this.productName = productName;

        this.price = price;

        this.quantity = quantity;
    }

    public double getSubtotal() {

        return price * quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {

        return productName +
                " x " +
                quantity +
                " = ₹" +
                getSubtotal();
    }
}


/* ============================================================
                       PAYMENT CLASS
   ============================================================ */

class Payment implements Serializable {

    private String transactionId;

    private double amount;

    private PaymentMethod method;

    private PaymentStatus status;

    private LocalDateTime paymentTime;

    public Payment(
            double amount,
            PaymentMethod method) {

        this.transactionId =
                UUID.randomUUID().toString();

        this.amount = amount;

        this.method = method;

        this.status = PaymentStatus.PENDING;
    }

    public void process()
            throws PaymentFailedException {

        Logger.info(
                "Processing payment..."
        );

        try {

            Thread.sleep(500);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            throw new PaymentFailedException(
                    "Payment interrupted"
            );
        }

        if (amount <= 0) {

            status = PaymentStatus.FAILED;

            throw new PaymentFailedException(
                    "Invalid payment amount"
            );
        }

        status = PaymentStatus.SUCCESS;

        paymentTime =
                LocalDateTime.now();

        Logger.info(
                "Payment successful: " +
                transactionId
        );
    }

    public void refund() {

        if (status == PaymentStatus.SUCCESS) {

            status = PaymentStatus.REFUNDED;

            Logger.info(
                    "Payment refunded: " +
                    transactionId
            );
        }
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}


/* ============================================================
                        ORDER CLASS
   ============================================================ */

class Order implements Serializable {

    private static final AtomicInteger
            ORDER_COUNTER =
            new AtomicInteger(1000);

    private int orderId;

    private int userId;

    private List<OrderItem> items;

    private double subtotal;

    private double discount;

    private double deliveryCharge;

    private double finalAmount;

    private OrderStatus status;

    private Payment payment;

    private Address deliveryAddress;

    private LocalDateTime createdAt;

    public Order(
            int userId,
            List<OrderItem> items,
            Address deliveryAddress) {

        this.orderId =
                ORDER_COUNTER.incrementAndGet();

        this.userId = userId;

        this.items =
                new ArrayList<>(items);

        this.deliveryAddress =
                deliveryAddress;

        this.status =
                OrderStatus.CREATED;

        this.createdAt =
                LocalDateTime.now();

        calculateSubtotal();

        this.deliveryCharge =
                calculateDeliveryCharge();

        calculateFinalAmount();
    }

    private void calculateSubtotal() {

        subtotal =
                items.stream()
                        .mapToDouble(
                                OrderItem::getSubtotal
                        )
                        .sum();
    }

    private double calculateDeliveryCharge() {

        if (subtotal >= 1000) {

            return 0;
        }

        return 50;
    }

    private void calculateFinalAmount() {

        finalAmount =
                subtotal -
                discount +
                deliveryCharge;
    }

    public void applyDiscount(
            double discount) {

        this.discount =
                Math.min(
                        discount,
                        subtotal
                );

        calculateFinalAmount();
    }

    public void setPayment(
            Payment payment) {

        this.payment = payment;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Payment getPayment() {
        return payment;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void updateStatus(
            OrderStatus status) {

        this.status = status;

        Logger.info(
                "Order " +
                orderId +
                " status changed to " +
                status
        );
    }

    public void printDetails() {

        System.out.println(
                "\n========== ORDER =========="
        );

        System.out.println(
                "Order ID: " +
                orderId
        );

        System.out.println(
                "User ID: " +
                userId
        );

        System.out.println(
                "Status: " +
                status
        );

        System.out.println(
                "\nItems:"
        );

        items.forEach(
                item ->
                        System.out.println(
                                "  " + item
                        )
        );

        System.out.println(
                "\nSubtotal: ₹" +
                subtotal
        );

        System.out.println(
                "Discount: ₹" +
                discount
        );

        System.out.println(
                "Delivery: ₹" +
                deliveryCharge
        );

        System.out.println(
                "Final Amount: ₹" +
                finalAmount
        );

        if (payment != null) {

            System.out.println(
                    "Payment: " +
                    payment.getStatus()
            );

            System.out.println(
                    "Transaction ID: " +
                    payment.getTransactionId()
            );
        }

        System.out.println(
                "Delivery Address: " +
                deliveryAddress
        );
    }
}


/* ============================================================
                 GENERIC REPOSITORY INTERFACE
   ============================================================ */

interface Repository<T, ID> {

    void save(T object);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    long count();
}


/* ============================================================
                  GENERIC IN-MEMORY REPOSITORY
   ============================================================ */

class InMemoryRepository<T, ID>
        implements Repository<T, ID> {

    private Map<ID, T> database =
            new ConcurrentHashMap<>();

    private java.util.function.Function<T, ID>
            idExtractor;

    public InMemoryRepository(
            java.util.function.Function<T, ID>
                    idExtractor) {

        this.idExtractor =
                idExtractor;
    }

    @Override
    public void save(T object) {

        ID id =
                idExtractor.apply(object);

        database.put(id, object);
    }

    @Override
    public Optional<T> findById(ID id) {

        return Optional.ofNullable(
                database.get(id)
        );
    }

    @Override
    public List<T> findAll() {

        return new ArrayList<>(
                database.values()
        );
    }

    @Override
    public void deleteById(ID id) {

        database.remove(id);
    }

    @Override
    public long count() {

        return database.size();
    }
}


/* ============================================================
                    PRODUCT SERVICE
   ============================================================ */

class ProductService {

    private final Repository<Product, Integer>
            productRepository;

    public ProductService() {

        productRepository =
                new InMemoryRepository<>(
                        Product::getId
                );
    }

    public void addProduct(Product product) {

        productRepository.save(product);

        Logger.info(
                "Product added: " +
                product.getName()
        );
    }

    public Product getProduct(int id)
            throws ProductNotFoundException {

        return productRepository
                .findById(id)
                .orElseThrow(
                        () ->
                                new ProductNotFoundException(
                                        "Product not found: " +
                                        id
                                )
                );
    }

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public void deleteProduct(int id) {

        productRepository.deleteById(id);
    }

    public List<Product> search(
            String keyword) {

        return productRepository
                .findAll()
                .stream()
                .filter(
                        p ->
                                p.matches(keyword)
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> filterByCategory(
            ProductCategory category) {

        return productRepository
                .findAll()
                .stream()
                .filter(
                        p ->
                                p.getCategory()
                                        == category
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> filter(
            Predicate<Product> condition) {

        return productRepository
                .findAll()
                .stream()
                .filter(condition)
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> sortByPrice(
            boolean ascending) {

        Comparator<Product> comparator =
                Comparator.comparingDouble(
                        Product::getPrice
                );

        if (!ascending) {

            comparator =
                    comparator.reversed();
        }

        return productRepository
                .findAll()
                .stream()
                .sorted(comparator)
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> sortByRating() {

        return productRepository
                .findAll()
                .stream()
                .sorted(
                        Comparator.comparingDouble(
                                Product::getRating
                        ).reversed()
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> getTopProducts(
            int limit) {

        return productRepository
                .findAll()
                .stream()
                .sorted(
                        Comparator.comparingDouble(
                                Product::getRating
                        ).reversed()
                )
                .limit(limit)
                .collect(
                        Collectors.toList()
                );
    }

    public void printProducts(
            List<Product> products) {

        if (products.isEmpty()) {

            System.out.println(
                    "No products found."
            );

            return;
        }

        products.forEach(
                System.out::println
        );
    }
}


/* ============================================================
                       USER SERVICE
   ============================================================ */

class UserService {

    private final Repository<User, Integer>
            userRepository;

    private final Map<String, Integer>
            emailIndex;

    public UserService() {

        userRepository =
                new InMemoryRepository<>(
                        User::getId
                );

        emailIndex =
                new ConcurrentHashMap<>();
    }

    public void register(User user) {

        if (emailIndex.containsKey(
                user.getEmail())) {

            throw new IllegalArgumentException(
                    "Email already registered"
            );
        }

        userRepository.save(user);

        emailIndex.put(
                user.getEmail(),
                user.getId()
        );

        Logger.info(
                "User registered: " +
                user.getName()
        );
    }

    public User getUser(int id)
            throws UserNotFoundException {

        return userRepository
                .findById(id)
                .orElseThrow(
                        () ->
                                new UserNotFoundException(
                                        "User not found"
                                )
                );
    }

    public User login(
            String email,
            String password)
            throws AuthenticationException {

        Integer id =
                emailIndex.get(email);

        if (id == null) {

            throw new AuthenticationException(
                    "Invalid email or password"
            );
        }

        User user;

        try {

            user = getUser(id);

        } catch (UserNotFoundException e) {

            throw new AuthenticationException(
                    "Invalid credentials"
            );
        }

        if (!user.authenticate(password)) {

            throw new AuthenticationException(
                    "Invalid email or password"
            );
        }

        Logger.info(
                "Login successful: " +
                email
        );

        return user;
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}


/* ============================================================
                       COUPON SERVICE
   ============================================================ */

class CouponService {

    private final Map<String, Coupon>
            coupons =
            new ConcurrentHashMap<>();

    public void addCoupon(Coupon coupon) {

        coupons.put(
                coupon.getCode(),
                coupon
        );
    }

    public Coupon getCoupon(String code)
            throws InvalidCouponException {

        Coupon coupon =
                coupons.get(code);

        if (coupon == null) {

            throw new InvalidCouponException(
                    "Coupon not found"
            );
        }

        return coupon;
    }

    public double applyCoupon(
            String code,
            double amount)
            throws InvalidCouponException {

        Coupon coupon =
                getCoupon(code);

        double discount =
                coupon.calculateDiscount(
                        amount
                );

        coupon.markUsed();

        return discount;
    }
}


/* ============================================================
                       REVIEW SERVICE
   ============================================================ */

class ReviewService {

    private final List<Review>
            reviews =
            new CopyOnWriteArrayList<>();

    private final ProductService
            productService;

    public ReviewService(
            ProductService productService) {

        this.productService =
                productService;
    }

    public void addReview(
            Review review)
            throws ProductNotFoundException {

        Product product =
                productService.getProduct(
                        review.getProductId()
                );

        reviews.add(review);

        product.addRating(
                review.getRating()
        );

        Logger.info(
                "Review added for " +
                product.getName()
        );
    }

    public List<Review> getProductReviews(
            int productId) {

        return reviews
                .stream()
                .filter(
                        r ->
                                r.getProductId()
                                        == productId
                )
                .collect(
                        Collectors.toList()
                );
    }

    public double getAverageRating(
            int productId) {

        return reviews
                .stream()
                .filter(
                        r ->
                                r.getProductId()
                                        == productId
                )
                .mapToInt(
                        Review::getRating
                )
                .average()
                .orElse(0);
    }
}


/* ============================================================
                      ORDER SERVICE
   ============================================================ */

class OrderService {

    private final Map<Integer, Order>
            orders =
            new ConcurrentHashMap<>();

    private final ProductService
            productService;

    private final CouponService
            couponService;

    private final ExecutorService
            executor =
            Executors.newFixedThreadPool(4);

    public OrderService(
            ProductService productService,
            CouponService couponService) {

        this.productService =
                productService;

        this.couponService =
                couponService;
    }

    public Order placeOrder(
            User user,
            Cart cart,
            Address address,
            PaymentMethod method,
            String couponCode)
            throws Exception {

        if (cart.isEmpty()) {

            throw new IllegalStateException(
                    "Cannot place empty cart"
            );
        }

        List<OrderItem> orderItems =
                new ArrayList<>();

        for (CartItem cartItem :
                cart.getItems().values()) {

            Product product =
                    cartItem.getProduct();

            int quantity =
                    cartItem.getQuantity();

            product.decreaseStock(quantity);

            orderItems.add(
                    new OrderItem(
                            product.getId(),
                            product.getName(),
                            product.getPrice(),
                            quantity
                    )
            );
        }

        Order order =
                new Order(
                        user.getId(),
                        orderItems,
                        address
                );

        if (couponCode != null &&
                !couponCode.isBlank()) {

            double discount =
                    couponService.applyCoupon(
                            couponCode,
                            order.getSubtotal()
                    );

            order.applyDiscount(
                    discount
            );
        }

        Payment payment =
                new Payment(
                        order.getFinalAmount(),
                        method
                );

        payment.process();

        order.setPayment(payment);

        order.updateStatus(
                OrderStatus.CONFIRMED
        );

        orders.put(
                order.getOrderId(),
                order
        );

        cart.clear();

        processOrderAsync(order);

        Logger.info(
                "Order created: " +
                order.getOrderId()
        );

        return order;
    }

    private void processOrderAsync(
            Order order) {

        executor.submit(
                () -> {

                    try {

                        Thread.sleep(1000);

                        order.updateStatus(
                                OrderStatus.PROCESSING
                        );

                        Thread.sleep(1000);

                        order.updateStatus(
                                OrderStatus.SHIPPED
                        );

                    } catch (
                            InterruptedException e) {

                        Thread.currentThread()
                                .interrupt();
                    }
                }
        );
    }

    public Order getOrder(int id)
            throws OrderNotFoundException {

        Order order =
                orders.get(id);

        if (order == null) {

            throw new OrderNotFoundException(
                    "Order not found"
            );
        }

        return order;
    }

    public List<Order> getUserOrders(
            int userId) {

        return orders
                .values()
                .stream()
                .filter(
                        o ->
                                o.getUserId()
                                        == userId
                )
                .sorted(
                        Comparator.comparing(
                                Order::getCreatedAt
                        ).reversed()
                )
                .collect(
                        Collectors.toList()
                );
    }

    public void cancelOrder(int orderId)
            throws OrderNotFoundException {

        Order order =
                getOrder(orderId);

        if (order.getStatus()
                == OrderStatus.DELIVERED) {

            throw new IllegalStateException(
                    "Delivered order cannot be cancelled"
            );
        }

        if (order.getStatus()
                == OrderStatus.CANCELLED) {

            return;
        }

        order.getItems()
                .forEach(
                        item -> {

                            try {

                                Product product =
                                        productService
                                                .getProduct(
                                                        item.getProductId()
                                                );

                                product.increaseStock(
                                        item.getQuantity()
                                );

                            } catch (
                                    ProductNotFoundException e) {

                                Logger.error(
                                        e.getMessage()
                                );
                            }
                        }
                );

        if (order.getPayment() != null) {

            order.getPayment().refund();
        }

        order.updateStatus(
                OrderStatus.CANCELLED
        );
    }

    public List<Order> getAllOrders() {

        return new ArrayList<>(
                orders.values()
        );
    }

    public void shutdown() {

        executor.shutdown();
    }
}


/* ============================================================
                     INVENTORY SERVICE
   ============================================================ */

class InventoryService {

    private final ProductService
            productService;

    public InventoryService(
            ProductService productService) {

        this.productService =
                productService;
    }

    public void restock(
            int productId,
            int quantity)
            throws ProductNotFoundException {

        Product product =
                productService.getProduct(
                        productId
                );

        product.increaseStock(quantity);
    }

    public List<Product> lowStockProducts(
            int threshold) {

        return productService
                .filter(
                        product ->
                                product.getStock()
                                        <= threshold
                );
    }

    public void printInventory() {

        System.out.println(
                "\n========== INVENTORY =========="
        );

        productService
                .getAllProducts()
                .forEach(
                        product ->
                                System.out.println(
                                        product.getName() +
                                        " | Stock: " +
                                        product.getStock()
                                )
                );
    }
}


/* ============================================================
                       ADMIN SERVICE
   ============================================================ */

class AdminService {

    private final ProductService
            productService;

    private final UserService
            userService;

    private final OrderService
            orderService;

    public AdminService(
            ProductService productService,
            UserService userService,
            OrderService orderService) {

        this.productService =
                productService;

        this.userService =
                userService;

        this.orderService =
                orderService;
    }

    public void printDashboard() {

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "        ADMIN DASHBOARD"
        );

        System.out.println(
                "================================"
        );

        System.out.println(
                "Products: " +
                productService
                        .getAllProducts()
                        .size()
        );

        System.out.println(
                "Users: " +
                userService
                        .getAllUsers()
                        .size()
        );

        System.out.println(
                "Orders: " +
                orderService
                        .getAllOrders()
                        .size()
        );

        double revenue =
                orderService
                        .getAllOrders()
                        .stream()
                        .filter(
                                order ->
                                        order.getPayment() != null
                                        &&
                                        order.getPayment()
                                                .getStatus()
                                                == PaymentStatus.SUCCESS
                        )
                        .mapToDouble(
                                Order::getFinalAmount
                        )
                        .sum();

        System.out.println(
                "Revenue: ₹" +
                revenue
        );
    }

    public void updateProductPrice(
            int productId,
            double price)
            throws ProductNotFoundException {

        Product product =
                productService.getProduct(
                        productId
                );

        product.updatePrice(price);
    }
}


/* ============================================================
                    FILE STORAGE SERVICE
   ============================================================ */

class FileStorageService {

    public static void saveObject(
            Object object,
            String fileName) {

        try (
                ObjectOutputStream output =
                        new ObjectOutputStream(
                                new FileOutputStream(
                                        fileName
                                )
                        )
        ) {

            output.writeObject(object);

            Logger.info(
                    "Data saved to " +
                    fileName
            );

        } catch (IOException e) {

            Logger.error(
                    "Failed to save data: " +
                    e.getMessage()
            );
        }
    }

    public static Object loadObject(
            String fileName) {

        try (
                ObjectInputStream input =
                        new ObjectInputStream(
                                new FileInputStream(
                                        fileName
                                )
                        )
        ) {

            return input.readObject();

        } catch (
                IOException |
                ClassNotFoundException e) {

            Logger.error(
                    "Failed to load data: " +
                    e.getMessage()
            );

            return null;
        }
    }
}


/* ============================================================
                   ANALYTICS SERVICE
   ============================================================ */

class AnalyticsService {

    private final OrderService
            orderService;

    private final ProductService
            productService;

    public AnalyticsService(
            OrderService orderService,
            ProductService productService) {

        this.orderService =
                orderService;

        this.productService =
                productService;
    }

    public double calculateRevenue() {

        return orderService
                .getAllOrders()
                .stream()
                .filter(
                        order ->
                                order.getPayment() != null
                                &&
                                order.getPayment()
                                        .getStatus()
                                        == PaymentStatus.SUCCESS
                )
                .mapToDouble(
                        Order::getFinalAmount
                )
                .sum();
    }

    public Map<ProductCategory, Long>
    productsByCategory() {

        return productService
                .getAllProducts()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.counting()
                        )
                );
    }

    public Optional<Product>
    mostExpensiveProduct() {

        return productService
                .getAllProducts()
                .stream()
                .max(
                        Comparator.comparingDouble(
                                Product::getPrice
                        )
                );
    }

    public Optional<Product>
    cheapestProduct() {

        return productService
                .getAllProducts()
                .stream()
                .min(
                        Comparator.comparingDouble(
                                Product::getPrice
                        )
                );
    }

    public double averageProductPrice() {

        return productService
                .getAllProducts()
                .stream()
                .mapToDouble(
                        Product::getPrice
                )
                .average()
                .orElse(0);
    }

    public void printReport() {

        System.out.println(
                "\n========== ANALYTICS =========="
        );

        System.out.println(
                "Revenue: ₹" +
                calculateRevenue()
        );

        System.out.println(
                "Average Product Price: ₹" +
                averageProductPrice()
        );

        System.out.println(
                "\nProducts by Category:"
        );

        productsByCategory()
                .forEach(
                        (category, count) ->
                                System.out.println(
                                        category +
                                        " = " +
                                        count
                                )
                );

        mostExpensiveProduct()
                .ifPresent(
                        product ->
                                System.out.println(
                                        "Most Expensive: " +
                                        product
                                )
                );

        cheapestProduct()
                .ifPresent(
                        product ->
                                System.out.println(
                                        "Cheapest: " +
                                        product
                                )
                );
    }
}


/* ============================================================
                     DATA INITIALIZER
   ============================================================ */

class DataInitializer {

    public static void initializeProducts(
            ProductService service) {

        service.addProduct(
                new Product(
                        101,
                        "MacBook Air M4",
                        "Apple laptop with M4 chip",
                        99999,
                        10,
                        ProductCategory.ELECTRONICS,
                        "Apple"
                )
        );

        service.addProduct(
                new Product(
                        102,
                        "iPhone 17",
                        "Latest Apple smartphone",
                        79999,
                        15,
                        ProductCategory.ELECTRONICS,
                        "Apple"
                )
        );

        service.addProduct(
                new Product(
                        103,
                        "Samsung Galaxy",
                        "Android smartphone",
                        59999,
                        20,
                        ProductCategory.ELECTRONICS,
                        "Samsung"
                )
        );

        service.addProduct(
                new Product(
                        104,
                        "Java Programming",
                        "Advanced Java programming book",
                        899,
                        50,
                        ProductCategory.BOOKS,
                        "TechBooks"
                )
        );

        service.addProduct(
                new Product(
                        105,
                        "Clean Code",
                        "Software engineering book",
                        799,
                        40,
                        ProductCategory.BOOKS,
                        "Robert Martin"
                )
        );

        service.addProduct(
                new Product(
                        106,
                        "Running Shoes",
                        "Professional running shoes",
                        2999,
                        30,
                        ProductCategory.SPORTS,
                        "Nike"
                )
        );

        service.addProduct(
                new Product(
                        107,
                        "T-Shirt",
                        "Cotton casual T-shirt",
                        799,
                        100,
                        ProductCategory.CLOTHING,
                        "Puma"
                )
        );

        service.addProduct(
                new Product(
                        108,
                        "Backpack",
                        "Laptop travel backpack",
                        1999,
                        35,
                        ProductCategory.CLOTHING,
                        "Wildcraft"
                )
        );

        service.addProduct(
                new Product(
                        109,
                        "Coffee Maker",
                        "Automatic coffee machine",
                        4999,
                        12,
                        ProductCategory.HOME,
                        "Philips"
                )
        );

        service.addProduct(
                new Product(
                        110,
                        "Smart Watch",
                        "Fitness tracking smartwatch",
                        3999,
                        25,
                        ProductCategory.ELECTRONICS,
                        "Noise"
                )
        );
    }

    public static void initializeUsers(
            UserService service) {

        User user1 =
                new User(
                        1,
                        "Darshan",
                        "darshan@example.com",
                        "1234",
                        "9876543210",
                        UserRole.CUSTOMER
                );

        user1.addAddress(
                new Address(
                        "101",
                        "MG Road",
                        "Bengaluru",
                        "Karnataka",
                        "560001",
                        "India"
                )
        );

        User user2 =
                new User(
                        2,
                        "Rahul",
                        "rahul@example.com",
                        "abcd",
                        "9876500000",
                        UserRole.CUSTOMER
                );

        user2.addAddress(
                new Address(
                        "202",
                        "Main Road",
                        "Mysore",
                        "Karnataka",
                        "570001",
                        "India"
                )
        );

        User admin =
                new User(
                        3,
                        "Admin",
                        "admin@example.com",
                        "admin123",
                        "9999999999",
                        UserRole.ADMIN
                );

        service.register(user1);

        service.register(user2);

        service.register(admin);
    }

    public static void initializeCoupons(
            CouponService service) {

        service.addCoupon(
                new Coupon(
                        "WELCOME10",
                        DiscountType.PERCENTAGE,
                        10,
                        500,
                        LocalDateTime.now()
                                .plusDays(30),
                        100
                )
        );

        service.addCoupon(
                new Coupon(
                        "SAVE500",
                        DiscountType.FIXED_AMOUNT,
                        500,
                        3000,
                        LocalDateTime.now()
                                .plusDays(30),
                        50
                )
        );
    }
}


/* ============================================================
                      SEARCH ENGINE
   ============================================================ */

class ProductSearchEngine {

    private final ProductService
            productService;

    public ProductSearchEngine(
            ProductService productService) {

        this.productService =
                productService;
    }

    public List<Product> search(
            String keyword) {

        return productService
                .getAllProducts()
                .stream()
                .filter(
                        product ->
                                product.matches(
                                        keyword
                                )
                )
                .sorted(
                        Comparator.comparingDouble(
                                Product::getRating
                        ).reversed()
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product> searchByPriceRange(
            double min,
            double max) {

        return productService
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getPrice() >= min
                                &&
                                p.getPrice() <= max
                )
                .sorted(
                        Comparator.comparingDouble(
                                Product::getPrice
                        )
                )
                .collect(
                        Collectors.toList()
                );
    }

    public List<Product>
    searchByMultipleConditions(
            String keyword,
            ProductCategory category,
            double maxPrice) {

        return productService
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.matches(keyword)
                )
                .filter(
                        p ->
                                p.getCategory()
                                        == category
                )
                .filter(
                        p ->
                                p.getPrice()
                                        <= maxPrice
                )
                .collect(
                        Collectors.toList()
                );
    }
}


/* ============================================================
                  RECOMMENDATION ENGINE
   ============================================================ */

class RecommendationEngine {

    private final ProductService
            productService;

    public RecommendationEngine(
            ProductService productService) {

        this.productService =
                productService;
    }

    public List<Product>
    recommendForUser(User user) {

        return productService
                .getAllProducts()
                .stream()
                .filter(
                        p ->
                                p.getStatus()
                                        == ProductStatus.ACTIVE
                )
                .sorted(
                        Comparator
                                .comparingDouble(
                                        Product::getRating
                                )
                                .reversed()
                )
                .limit(5)
                .collect(
                        Collectors.toList()
                );
    }
}


/* ============================================================
                    DELIVERY SERVICE
   ============================================================ */

class DeliveryService {

    private final Map<Integer,
            DeliveryStatus> deliveryStatuses =
            new ConcurrentHashMap<>();

    private final ExecutorService
            executor =
            Executors.newCachedThreadPool();

    public void assignDelivery(int orderId) {

        deliveryStatuses.put(
                orderId,
                DeliveryStatus.ASSIGNED
        );

        Logger.info(
                "Delivery assigned for order " +
                orderId
        );
    }

    public void startDelivery(int orderId) {

        executor.submit(
                () -> {

                    try {

                        deliveryStatuses.put(
                                orderId,
                                DeliveryStatus.PICKED_UP
                        );

                        Thread.sleep(1000);

                        deliveryStatuses.put(
                                orderId,
                                DeliveryStatus.IN_TRANSIT
                        );

                        Thread.sleep(1500);

                        deliveryStatuses.put(
                                orderId,
                                DeliveryStatus.DELIVERED
                        );

                        Logger.info(
                                "Order delivered: " +
                                orderId
                        );

                    } catch (
                            InterruptedException e) {

                        Thread.currentThread()
                                .interrupt();
                    }
                }
        );
    }

    public DeliveryStatus getStatus(
            int orderId) {

        return deliveryStatuses.getOrDefault(
                orderId,
                DeliveryStatus.NOT_ASSIGNED
        );
    }

    public void shutdown() {

        executor.shutdown();
    }
}


/* ============================================================
                      NOTIFICATION
   ============================================================ */

interface NotificationService {

    void send(
            User user,
            String message
    );
}


/* ============================================================
                    EMAIL NOTIFICATION
   ============================================================ */

class EmailNotificationService
        implements NotificationService {

    @Override
    public void send(
            User user,
            String message) {

        Logger.info(
                "EMAIL sent to " +
                user.getEmail() +
                ": " +
                message
        );
    }
}


/* ============================================================
                     SMS NOTIFICATION
   ============================================================ */

class SmsNotificationService
        implements NotificationService {

    @Override
    public void send(
            User user,
            String message) {

        Logger.info(
                "SMS sent to " +
                user.getPhone() +
                ": " +
                message
        );
    }
}


/* ============================================================
                  NOTIFICATION MANAGER
   ============================================================ */

class NotificationManager {

    private final List<NotificationService>
            services =
            new ArrayList<>();

    public void addService(
            NotificationService service) {

        services.add(service);
    }

    public void notifyUser(
            User user,
            String message) {

        services.forEach(
                service ->
                        service.send(
                                user,
                                message
                        )
        );
    }
}


/* ============================================================
                       MAIN APPLICATION
   ============================================================ */

public class ECommerceApplication {

    private static final Scanner scanner =
            new Scanner(System.in);

    private static final ProductService
            productService =
            new ProductService();

    private static final UserService
            userService =
            new UserService();

    private static final CouponService
            couponService =
            new CouponService();

    private static final ReviewService
            reviewService =
            new ReviewService(
                    productService
            );

    private static final OrderService
            orderService =
            new OrderService(
                    productService,
                    couponService
            );

    private static final InventoryService
            inventoryService =
            new InventoryService(
                    productService
            );

    private static final AdminService
            adminService =
            new AdminService(
                    productService,
                    userService,
                    orderService
            );

    private static final AnalyticsService
            analyticsService =
            new AnalyticsService(
                    orderService,
                    productService
            );

    private static final ProductSearchEngine
            searchEngine =
            new ProductSearchEngine(
                    productService
            );

    private static final RecommendationEngine
            recommendationEngine =
            new RecommendationEngine(
                    productService
            );

    private static final DeliveryService
            deliveryService =
            new DeliveryService();

    private static final NotificationManager
            notificationManager =
            new NotificationManager();


    /* ========================================================
                         INITIALIZATION
       ======================================================== */

    private static void initialize() {

        DataInitializer
                .initializeProducts(
                        productService
                );

        DataInitializer
                .initializeUsers(
                        userService
                );

        DataInitializer
                .initializeCoupons(
                        couponService
                );

        notificationManager
                .addService(
                        new EmailNotificationService()
                );

        notificationManager
                .addService(
                        new SmsNotificationService()
                );

        Logger.info(
                "Application initialized"
        );
    }


    /* ========================================================
                           MAIN
       ======================================================== */

    public static void main(
            String[] args) {

        initialize();

        runDemo();

        runApplication();

        orderService.shutdown();

        deliveryService.shutdown();

        scanner.close();
    }


    /* ========================================================
                           DEMO
       ======================================================== */

    private static void runDemo() {

        System.out.println(
                "\n=========================================="
        );

        System.out.println(
                "      E-COMMERCE BACKEND DEMO"
        );

        System.out.println(
                "=========================================="
        );

        System.out.println(
                "\nTotal Products: " +
                productService
                        .getAllProducts()
                        .size()
        );

        System.out.println(
                "\nTop Products:"
        );

        productService
                .getTopProducts(5)
                .forEach(
                        System.out::println
                );

        System.out.println(
                "\nElectronics:"
        );

        productService
                .filterByCategory(
                        ProductCategory.ELECTRONICS
                )
                .forEach(
                        System.out::println
                );

        System.out.println(
                "\nProducts below ₹5000:"
        );

        productService
                .filter(
                        p ->
                                p.getPrice() < 5000
                )
                .forEach(
                        System.out::println
                );

        analyticsService
                .printReport();
    }


    /* ========================================================
                       APPLICATION MENU
       ======================================================== */

    private static void runApplication() {

        while (true) {

            printMainMenu();

            int choice =
                    readInt(
                            "Enter choice: "
                    );

            try {

                switch (choice) {

                    case 1:
                        browseProducts();
                        break;

                    case 2:
                        searchProducts();
                        break;

                    case 3:
                        customerLogin();
                        break;

                    case 4:
                        registerUser();
                        break;

                    case 5:
                        adminLogin();
                        break;

                    case 6:
                        analyticsService
                                .printReport();
                        break;

                    case 7:
                        inventoryService
                                .printInventory();
                        break;

                    case 0:

                        System.out.println(
                                "Thank you for using the application."
                        );

                        return;

                    default:

                        System.out.println(
                                "Invalid choice."
                        );
                }

            } catch (Exception e) {

                Logger.error(
                        e.getMessage()
                );
            }
        }
    }


    /* ========================================================
                      MAIN MENU
       ======================================================== */

    private static void printMainMenu() {

        System.out.println(
                "\n=============================="
        );

        System.out.println(
                "       E-COMMERCE SYSTEM"
        );

        System.out.println(
                "=============================="
        );

        System.out.println(
                "1. Browse Products"
        );

        System.out.println(
                "2. Search Products"
        );

        System.out.println(
                "3. Customer Login"
        );

        System.out.println(
                "4. Register User"
        );

        System.out.println(
                "5. Admin Login"
        );

        System.out.println(
                "6. Analytics"
        );

        System.out.println(
                "7. Inventory"
        );

        System.out.println(
                "0. Exit"
        );
    }


    /* ========================================================
                      BROWSE PRODUCTS
       ======================================================== */

    private static void browseProducts() {

        System.out.println(
                "\n========== PRODUCTS =========="
        );

        productService
                .getAllProducts()
                .stream()
                .sorted()
                .forEach(
                        System.out::println
                );
    }


    /* ========================================================
                       SEARCH PRODUCTS
       ======================================================== */

    private static void searchProducts() {

        String keyword =
                readString(
                        "Search keyword: "
                );

        List<Product> results =
                searchEngine.search(
                        keyword
                );

        System.out.println(
                "\nSearch Results:"
        );

        productService
                .printProducts(results);
    }


    /* ========================================================
                     REGISTER USER
       ======================================================== */

    private static void registerUser() {

        int id =
                new Random()
                        .nextInt(10000) + 10;

        String name =
                readString(
                        "Name: "
                );

        String email =
                readString(
                        "Email: "
                );

        String password =
                readString(
                        "Password: "
                );

        String phone =
                readString(
                        "Phone: "
                );

        User user =
                new User(
                        id,
                        name,
                        email,
                        password,
                        phone,
                        UserRole.CUSTOMER
                );

        userService.register(user);

        System.out.println(
                "Registration successful."
        );
    }


    /* ========================================================
                     CUSTOMER LOGIN
       ======================================================== */

    private static void customerLogin()
            throws Exception {

        String email =
                readString(
                        "Email: "
                );

        String password =
                readString(
                        "Password: "
                );

        User user =
                userService.login(
                        email,
                        password
                );

        customerMenu(user);
    }


    /* ========================================================
                     CUSTOMER MENU
       ======================================================== */

    private static void customerMenu(
            User user)
            throws Exception {

        Cart cart =
                new Cart(
                        user.getId()
                );

        while (true) {

            System.out.println(
                    "\n=============================="
            );

            System.out.println(
                    "Welcome, " +
                    user.getName()
            );

            System.out.println(
                    "=============================="
            );

            System.out.println(
                    "1. Browse Products"
            );

            System.out.println(
                    "2. Search Products"
            );

            System.out.println(
                    "3. Add Product to Cart"
            );

            System.out.println(
                    "4. Remove Product from Cart"
            );

            System.out.println(
                    "5. View Cart"
            );

            System.out.println(
                    "6. Place Order"
            );

            System.out.println(
                    "7. View Orders"
            );

            System.out.println(
                    "8. Add Review"
            );

            System.out.println(
                    "9. Recommendations"
            );

            System.out.println(
                    "10. Add Address"
            );

            System.out.println(
                    "0. Logout"
            );

            int choice =
                    readInt(
                            "Choice: "
                    );

            switch (choice) {

                case 1:

                    browseProducts();

                    break;

                case 2:

                    searchProducts();

                    break;

                case 3:

                    addToCart(cart);

                    break;

                case 4:

                    removeFromCart(cart);

                    break;

                case 5:

                    cart.printCart();

                    break;

                case 6:

                    placeOrder(
                            user,
                            cart
                    );

                    break;

                case 7:

                    viewOrders(user);

                    break;

                case 8:

                    addReview(user);

                    break;

                case 9:

                    showRecommendations(
                            user
                    );

                    break;

                case 10:

                    addAddress(user);

                    break;

                case 0:

                    return;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }


    /* ========================================================
                       ADD TO CART
       ======================================================== */

    private static void addToCart(
            Cart cart)
            throws Exception {

        int productId =
                readInt(
                        "Product ID: "
                );

        int quantity =
                readInt(
                        "Quantity: "
                );

        Product product =
                productService
                        .getProduct(
                                productId
                        );

        cart.addProduct(
                product,
                quantity
        );

        System.out.println(
                "Product added successfully."
        );
    }


    /* ========================================================
                    REMOVE FROM CART
       ======================================================== */

    private static void removeFromCart(
            Cart cart) {

        int productId =
                readInt(
                        "Product ID: "
                );

        cart.removeProduct(
                productId
        );

        System.out.println(
                "Product removed."
        );
    }


    /* ========================================================
                       PLACE ORDER
       ======================================================== */

    private static void placeOrder(
            User user,
            Cart cart)
            throws Exception {

        if (user.getAddresses().isEmpty()) {

            System.out.println(
                    "Please add an address first."
            );

            return;
        }

        System.out.println(
                "\nSelect payment method:"
        );

        PaymentMethod[] methods =
                PaymentMethod.values();

        for (int i = 0;
             i < methods.length;
             i++) {

            System.out.println(
                    (i + 1) +
                    ". " +
                    methods[i]
            );
        }

        int choice =
                readInt(
                        "Choice: "
                );

        if (choice < 1 ||
                choice > methods.length) {

            System.out.println(
                    "Invalid payment method."
            );

            return;
        }

        PaymentMethod method =
                methods[choice - 1];

        String coupon =
                readString(
                        "Coupon code (press Enter to skip): "
                );

        if (coupon.isBlank()) {

            coupon = null;
        }

        Order order =
                orderService.placeOrder(
                        user,
                        cart,
                        user.getAddresses().get(0),
                        method,
                        coupon
                );

        order.printDetails();

        notificationManager.notifyUser(
                user,
                "Your order " +
                order.getOrderId() +
                " has been confirmed."
        );

        deliveryService.assignDelivery(
                order.getOrderId()
        );

        deliveryService.startDelivery(
                order.getOrderId()
        );
    }


    /* ========================================================
                       VIEW ORDERS
       ======================================================== */

    private static void viewOrders(
            User user) {

        List<Order> orders =
                orderService.getUserOrders(
                        user.getId()
                );

        if (orders.isEmpty()) {

            System.out.println(
                    "No orders found."
            );

            return;
        }

        orders.forEach(
                Order::printDetails
        );
    }


    /* ========================================================
                       ADD REVIEW
       ======================================================== */

    private static void addReview(
            User user)
            throws Exception {

        int productId =
                readInt(
                        "Product ID: "
                );

        int rating =
                readInt(
                        "Rating 1-5: "
                );

        String comment =
                readString(
                        "Comment: "
                );

        Review review =
                new Review(
                        user.getId(),
                        productId,
                        rating,
                        comment
                );

        reviewService.addReview(
                review
        );

        System.out.println(
                "Review added successfully."
        );
    }


    /* ========================================================
                    RECOMMENDATIONS
       ======================================================== */

    private static void showRecommendations(
            User user) {

        System.out.println(
                "\nRecommended Products:"
        );

        recommendationEngine
                .recommendForUser(user)
                .forEach(
                        System.out::println
                );
    }


    /* ========================================================
                       ADD ADDRESS
       ======================================================== */

    private static void addAddress(
            User user) {

        String house =
                readString(
                        "House number: "
                );

        String street =
                readString(
                        "Street: "
                );

        String city =
                readString(
                        "City: "
                );

        String state =
                readString(
                        "State: "
                );

        String pincode =
                readString(
                        "Pincode: "
                );

        Address address =
                new Address(
                        house,
                        street,
                        city,
                        state,
                        pincode,
                        "India"
                );

        user.addAddress(
                address
        );

        System.out.println(
                "Address added."
        );
    }


    /* ========================================================
                        ADMIN LOGIN
       ======================================================== */

    private static void adminLogin()
            throws Exception {

        String email =
                readString(
                        "Admin email: "
                );

        String password =
                readString(
                        "Password: "
                );

        User user =
                userService.login(
                        email,
                        password
                );

        if (user.getRole()
                != UserRole.ADMIN) {

            throw new AuthenticationException(
                    "You are not an administrator"
            );
        }

        adminMenu();
    }


    /* ========================================================
                         ADMIN MENU
       ======================================================== */

    private static void adminMenu()
            throws Exception {

        while (true) {

            System.out.println(
                    "\n========== ADMIN =========="
            );

            System.out.println(
                    "1. Dashboard"
            );

            System.out.println(
                    "2. Add Product"
            );

            System.out.println(
                    "3. Update Product Price"
            );

            System.out.println(
                    "4. Restock Product"
            );

            System.out.println(
                    "5. View Inventory"
            );

            System.out.println(
                    "6. View Orders"
            );

            System.out.println(
                    "7. View Users"
            );

            System.out.println(
                    "0. Logout"
            );

            int choice =
                    readInt(
                            "Choice: "
                    );

            switch (choice) {

                case 1:

                    adminService
                            .printDashboard();

                    break;

                case 2:

                    addProductAdmin();

                    break;

                case 3:

                    updateProductPrice();

                    break;

                case 4:

                    restockProduct();

                    break;

                case 5:

                    inventoryService
                            .printInventory();

                    break;

                case 6:

                    orderService
                            .getAllOrders()
                            .forEach(
                                    Order::printDetails
                            );

                    break;

                case 7:

                    userService
                            .getAllUsers()
                            .forEach(
                                    System.out::println
                            );

                    break;

                case 0:

                    return;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }


    /* ========================================================
                     ADD PRODUCT ADMIN
       ======================================================== */

    private static void addProductAdmin() {

        int id =
                readInt(
                        "Product ID: "
                );

        String name =
                readString(
                        "Name: "
                );

        String description =
                readString(
                        "Description: "
                );

        double price =
                readDouble(
                        "Price: "
                );

        int stock =
                readInt(
                        "Stock: "
                );

        System.out.println(
                "Categories:"
        );

        ProductCategory[] categories =
                ProductCategory.values();

        for (int i = 0;
             i < categories.length;
             i++) {

            System.out.println(
                    (i + 1) +
                    ". " +
                    categories[i]
            );
        }

        int categoryChoice =
                readInt(
                        "Category: "
                );

        ProductCategory category =
                categories[
                        categoryChoice - 1
                ];

        String brand =
                readString(
                        "Brand: "
                );

        Product product =
                new Product(
                        id,
                        name,
                        description,
                        price,
                        stock,
                        category,
                        brand
                );

        productService.addProduct(
                product
        );

        System.out.println(
                "Product added."
        );
    }


    /* ========================================================
                   UPDATE PRODUCT PRICE
       ======================================================== */

    private static void
    updateProductPrice()
            throws Exception {

        int id =
                readInt(
                        "Product ID: "
                );

        double price =
                readDouble(
                        "New price: "
                );

        adminService.updateProductPrice(
                id,
                price
        );

        System.out.println(
                "Price updated."
        );
    }


    /* ========================================================
                       RESTOCK PRODUCT
       ======================================================== */

    private static void restockProduct()
            throws Exception {

        int id =
                readInt(
                        "Product ID: "
                );

        int quantity =
                readInt(
                        "Quantity: "
                );

        inventoryService.restock(
                id,
                quantity
        );

        System.out.println(
                "Product restocked."
        );
    }


    /* ========================================================
                       INPUT METHODS
       ======================================================== */

    private static String readString(
            String message) {

        System.out.print(message);

        return scanner.nextLine();
    }

    private static int readInt(
            String message) {

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine()
                                .trim()
                );

            } catch (
                    NumberFormatException e) {

                System.out.println(
                        "Please enter a valid integer."
                );
            }
        }
    }

    private static double readDouble(
            String message) {

        while (true) {

            try {

                System.out.print(message);

                return Double.parseDouble(
                        scanner.nextLine()
                                .trim()
                );

            } catch (
                    NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }
}