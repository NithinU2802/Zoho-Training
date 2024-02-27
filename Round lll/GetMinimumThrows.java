import java.util.*;

class Node {
    int point;
    int distance;

    public Node(int point, int distance) {
        this.point = point;
        this.distance = distance;
    }

    public void addPoint(int point) {
        this.point = point;
    }

    public void addDistance(int distance) {
        this.distance = distance;
    }

}

class GetMinimumThrows {

    public static int getMinimumThrows(int[] move, int n) {
        int d = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        boolean[] visit = new boolean[n];
        visit[0]=true;
        while (!queue.isEmpty()) {
            Node a = queue.remove();
            d = a.distance;
            if (a.point == n - 1)
                break;
            for (int i = a.point + 1; i < n && i <= a.point + 6; i++) {
                if (!visit[i]) {
                    int point = 0;
                    if (move[i] != -1)
                        point = move[i];
                    else
                        point = i;
                    queue.offer(new Node(point, d + 1));
                    visit[i] = true;
                }
            }
        }
        return d;
    }

    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        int m = x.nextInt(), n = x.nextInt();
        System.out.print("Enter No of Snake : ");
        int snake = x.nextInt();
        System.out.println("Enter Snake Head and Tail : ");
        int[] move = new int[m * n];
        Arrays.fill(move, -1);
        for (int i = 0; i < snake; i++) {
            System.out.print("Enter Head : ");
            int head = x.nextInt();
            System.out.print("Enter Tail : ");
            int tail = x.nextInt();
            move[head] = tail;
        }
        System.out.print("Enter No of Ladder :");
        int ladder=x.nextInt();
        for (int i = 0; i < ladder; i++) {
            System.out.print("Enter Foot : ");
            int head = x.nextInt();
            System.out.print("Enter Rail : ");
            int tail = x.nextInt();
            move[head] = tail;
        }
        System.out.println(getMinimumThrows(move, m*n));
    }
}
