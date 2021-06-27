
class GFG{
static int powmod(int x, int y, int p) 
{ 
    int res = 1; 
  
    x = x % p; 
  
    while (y > 0) 
    { 
        if ((y & 1)>0) 
            res = (res*x) % p; 
  
        y = y>>1; // y = y/2 
        x = (x*x) % p; 
    } 
    return res; 
} 
  
static int discreteLogarithm(int a, int b, int m) { 
  
    int n = (int) (Math.sqrt (m) + 1); 
  
    int[] value=new int[m]; 
  
    for (int i = n; i >= 1; --i) 
        value[ powmod (a, i * n, m) ] = i; 
  
    for (int j = 0; j < n; ++j) 
    
    { 
        int cur = (powmod (a, j, m) * b) % m; 
        if (value[cur]>0) 
        { 
            int ans = value[cur] * n - j; 
            if (ans < m) 
                return ans; 
        } 
    } 
    return -1; 
} 
  
public static void main(String[] args) 
{ 
    int a = 2, b = 3, m = 5; 
    System.out.println(discreteLogarithm(a, b, m)); 
  
    a = 3;
    b = 7;
    m = 11; 
    System.out.println(discreteLogarithm(a, b, m)); 
} 
}