class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
class SocialMediaList {
    private UserNode head;
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }
    public void addFriend(int userId1, int userId2) {
        UserNode user1 = searchByIdNode(userId1);
        UserNode user2 = searchByIdNode(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }
        user1.friends = addFriendToList(user1.friends, userId2);
        user2.friends = addFriendToList(user2.friends, userId1);
        System.out.println("Friend connection is  added");
    }
    private FriendNode addFriendToList(FriendNode head, int id) {
        FriendNode newNode = new FriendNode(id);
        newNode.next = head;
        return newNode;
    }
    public void removeFriend(int userId1, int userId2) {
        UserNode u1 = searchByIdNode(userId1);
        UserNode u2 = searchByIdNode(userId2);
        if (u1 == null || u2 == null) {
            System.out.println("User is not found");
            return;
        }
        u1.friends = removeFriendFromList(u1.friends, userId2);
        u2.friends = removeFriendFromList(u2.friends, userId1);
        System.out.println("Friend connection is removed");
    }
    private FriendNode removeFriendFromList(FriendNode head, int id) {
        if (head == null) return null;
        if (head.friendId == id) {
            return head.next;
        }
        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
    public void displayFriends(int userId) {
        UserNode user = searchByIdNode(userId);
        if (user == null) {
            System.out.println("User is not found");
            return;
        }
        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friends;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }
        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = searchByIdNode(userId1);
        UserNode user2 = searchByIdNode(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("User is not found");
            return;
        }
        System.out.println("Mutual Friends:");
        FriendNode f1 = user1.friends;
        boolean found = false;
        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        if (!found)
            System.out.println("No mutual friends");
    }
    public void searchById(int id) {
        UserNode user = searchByIdNode(id);
        if (user != null)
            displayUser(user);
        else
            System.out.println("User is not found");
    }
    private UserNode searchByIdNode(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("User is not found");
    }
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
    private void displayUser(UserNode user) {
        System.out.println("User ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
    }
}
public class SocialMedia {
    public static void main(String[] args) {
        SocialMediaList account = new SocialMediaList();
        account.addUser(1, "Daven", 23);
        account.addUser(2, "Nova", 26);
        account.addUser(3, "Tslia", 20);
        account.addUser(4, "Aaron", 22);
        account.addFriend(1, 2);
        account.addFriend(1, 3);
        account.addFriend(2, 3);
        account.addFriend(3, 4);
        account.displayFriends(1);

        System.out.println("Mutual Friends between 1 and 2");
        account.findMutualFriends(1, 2);

        System.out.println("Search user by name");
        account.searchByName("Nova");

        System.out.println("Friend Count ");
        account.countFriends();

        System.out.println("Remove Friend Connection (1 & 2)");
        account.removeFriend(1, 2);

        account.displayFriends(1);
    }
}
