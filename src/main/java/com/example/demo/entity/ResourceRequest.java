@Entity
public class ResourceRequest {

    @Id @GeneratedValue
    private Long id;

    private String resourceType;
    private String purpose;
    private String status = "PENDING";

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private User requestedBy;

    public ResourceRequest() {}

    // getters & setters
}
