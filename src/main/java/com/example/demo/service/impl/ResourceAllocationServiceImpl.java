@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceRequestRepository reqRepo;
    private final ResourceRepository resRepo;
    private final ResourceAllocationRepository allocRepo;

    public ResourceAllocationServiceImpl(ResourceRequestRepository r,
                                         ResourceRepository res,
                                         ResourceAllocationRepository a) {
        this.reqRepo = r;
        this.resRepo = res;
        this.allocRepo = a;
    }

    public ResourceAllocation autoAllocate(Long requestId) {

        ResourceRequest req = reqRepo.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        List<Resource> list = resRepo.findByResourceType(req.getResourceType());
        if (list.isEmpty())
            throw new RuntimeException("No resources");

        ResourceAllocation alloc = new ResourceAllocation();
        alloc.setRequest(req);
        alloc.setResource(list.get(0));
        return allocRepo.save(alloc);
    }

    public List<ResourceAllocation> getAllAllocations() {
        return allocRepo.findAll();
    }
}
