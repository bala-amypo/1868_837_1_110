@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository reqRepo;
    private final UserRepository userRepo;

    public ResourceRequestServiceImpl(ResourceRequestRepository r, UserRepository u) {
        this.reqRepo = r;
        this.userRepo = u;
    }

    public ResourceRequest createRequest(Long userId, ResourceRequest req) {
        User u = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (req.getStartTime().isAfter(req.getEndTime()))
            throw new IllegalArgumentException("Invalid time");

        req.setRequestedBy(u);
        req.setStatus("PENDING");
        return reqRepo.save(req);
    }

    public List<ResourceRequest> getRequestsByUser(Long id) {
        return reqRepo.findByRequestedBy_Id(id);
    }

    public ResourceRequest updateRequestStatus(Long id, String status) {
        ResourceRequest r = reqRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));
        r.setStatus(status);
        return reqRepo.save(r);
    }
}
