public class jul5_loop {
    public static void main(String[] args) {
        System.out.println("yaha se while loop hai ");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("yaha se do while loop hai ");
        int y = 5;
        do {
            System.out.println(y);
            y++;
        }while (y <= 10);
        System.out.println("contiue/break ");
        for (int z = 0; z < 10; z++) {
            if (z == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
