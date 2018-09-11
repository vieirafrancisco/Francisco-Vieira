#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main(){

    int n, result, total_fraudas = 0;
    string s;

    while(true){
        cin >> n >> s;

        if(n <= 2)
            total_fraudas += 9*30;
        else
            total_fraudas += 6*30;

        if(s != "sim")
            break;
    }

    result = ceil(total_fraudas/100.0);
    
    cout << result << "\n";
    cout << result*100 - total_fraudas << "\n";

    return 0;
}