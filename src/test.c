//This is a test program to demonstrate my working compiler by outputting all prime numbers < 100
char globalchar;
int isprime(int n){
    int i;
    i = 1;
    //nested ifs in whiles
    while (i < n-1){
        i = i + 1;
        if (n % i == 0){
            return 0;
            if ( 1 > 2){
                while(1 > 2){
                    print("Something is seriously wrong here");
                }
            }
        }
    }
    return 1;
}

main(){
    int i;
    int k;
    int t;
    int c;
    //showing that negatives work
    c = -1;
    print("Printing all prime numbers under:");
    i = 2;
    k = 100;
    output(k);
    print(" ");
    output(i);
    while (i < k){
        i = i + 1;
        t = isprime(i);
        if (t == 1){
            output(i);
        }
    }
}
