package insurance_policy;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);

        expiryMap
                .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
                .add(policy);
    }
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }
    public void listPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("Policies expiring in next 30 days:");
        for (List<Policy> policies :
                expiryMap.subMap(today, true, next30Days, true).values()) {

            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
    }
    public void listPoliciesByHolder(String holderName) {
        System.out.println("\nPolicies for holder: " + holderName);
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                System.out.println(policy);
            }
        }
    }
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                insertionOrderMap.remove(policy.getPolicyNumber());
            }
        }
        expiryMap.headMap(today).clear();
        System.out.println("Expired policies removed.");
    }
    public void displayInsertionOrder() {
        System.out.println("Policies in insertion order:");
        for (Policy policy : insertionOrderMap.values()) {
            System.out.println(policy);
        }
    }
}
