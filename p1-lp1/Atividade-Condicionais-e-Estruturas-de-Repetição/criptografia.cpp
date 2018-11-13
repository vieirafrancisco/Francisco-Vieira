#include <iostream>
#include <string>

using namespace std;

int main(){

    string a, b;
    cin >> a >> b;

    string result = "";
    bool r = true;

    if(a.length() != b.length())
        r = false;
    else
        for(int i = 0; i < a.length(); i++)
            if((a[i] >= 65 && a[i] <= 90) || (b[i] >= 65 && b[i] <= 90))
                r = false;
            else if(a[i] == b[i] && a[i] != 97 && a[i] != 101 && a[i] != 104 && a[i] != 111 && a[i] != 117)
                result += ("%d", i+48);
            else if(i % 2 == 0)
                result += ("%d", a[i]-32);
            else
                result += "!!";

    if(r)
        cout << result << endl;
    else
        cout << "ERRO" << endl;

    return 0;
}