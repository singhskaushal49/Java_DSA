package Lec11;

public class Time_and_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        	
        	
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        
        int n = 1000;
        int i = 0;
        while (i < n) {
        	System.out.println("Hey");
        	// 0(N)
        	i++;
        }
        while(n > 0) {
        	// 0(log(N) base 2)
        	System.out.println("Hey");
        	n /= 2;
        }
        while (i <= n) {
        	System.out.println("Hey");
        	// 0(N)
        	i *= 2;
        	i *= 3;
        }
        while (n > 0) {
        	System.out.println("Hey");
        	// 0(log(N) base 6)
        	n /= 2;
        	n /= 3;
        }
        while (n > 0) {
        	System.out.println("Hey");
        	// 0(N)
        	n = n - 1;
        }
        while (n > 0) {
        	System.out.println("Hey");
        	// 0(N)
        	n = n - 2;
        	n = n - 3;
        }
        for (i = 1; i <= n; i++) {
        	for (int j = 1; j <= n; j++) {
        		// 0(N^2)
        		System.out.println("hey");
        	}
        }
        for (i = 1; i * i <= n; i++) {
        	// 0 (sqrt(N))
        	System.out.println("hey");
        }
        for (i = 1; i <= n; i++) {
        	for (int j = 1; j <= i * i; j++) {
        		for (int k = 1; k <= n / 2; k++) {
        			System.out.println("hey");
        		}
        	}
        }
        for (i = 1; i <= n; i *= 2) {
        	System.out.println("hey");
        	// 0(log(N) base 2)
        }
        for (i = n / 2; i <= n; i++) {
        	for (int j = 1; j <= n / 2; j++) {
        		for (int k = 1; k <= n; k = k * 2) {
        			// 0(N^2logn) base 2
        			System.out.println("hey");
        		}
        	}
        }
        for (i = 1; i <= n; i++) {
        	for (int j = 1; j <= n; j += i) {
        		System.out.println();
        	}
        }
	}

}
