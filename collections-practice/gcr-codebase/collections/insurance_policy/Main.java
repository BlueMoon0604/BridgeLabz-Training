package insurance_policy;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        
        manager.addPolicy(new Policy("P101", "David", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P102", "Macheky", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P103", "Rua", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P104", "Ronaldo", LocalDate.now().plusDays(25)));

        System.out.println("Retrieve policy P101:");
        System.out.println(manager.getPolicyByNumber("P101"));

        manager.listPoliciesExpiringSoon();
        manager.listPoliciesByHolder("Praney");
        manager.removeExpiredPolicies();
        manager.displayInsertionOrder();
    }
}
