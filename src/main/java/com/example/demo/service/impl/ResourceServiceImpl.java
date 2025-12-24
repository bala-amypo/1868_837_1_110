@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repo;

    public ResourceServiceImpl(ResourceRepository repo) {
        this.repo = repo;
    }

    public Resource createResource(Resource r) {
        if (r.getResourceType() == null || r.getCapacity() == null || r.getCapacity() < 1)
            throw new IllegalArgumentException("Invalid resource");

        if (repo.existsByResourceName(r.getResourceName()))
            throw new IllegalArgumentException("Resource exists");

        return repo.save(r);
    }

    public List<Resource> getAllResources() {
        return repo.findAll();
    }
}
