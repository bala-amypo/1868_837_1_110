@Entity
public class ResourceAllocation {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Resource resource;

    @OneToOne
    private ResourceRequest request;

    private LocalDateTime allocatedAt;

    private Boolean conflictFlag = false;
    private String notes;

    @PrePersist
    public void onCreate() {
        allocatedAt = LocalDateTime.now();
    }

    // getters & setters
}
