@Service
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AllocationRuleRepository repo;

    public AllocationRuleServiceImpl(AllocationRuleRepository repo) {
        this.repo = repo;
    }

    public AllocationRule createRule(AllocationRule r) {
        if (repo.existsByRuleName(r.getRuleName()))
            throw new IllegalArgumentException("Rule exists");

        return repo.save(r);
    }

    public AllocationRule getRule(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<AllocationRule> getAllRules() {
        return repo.findAll();
    }
}
