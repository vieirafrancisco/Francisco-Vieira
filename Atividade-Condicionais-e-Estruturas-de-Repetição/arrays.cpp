#include <iostream>

using namespace std;

int main(){

    int n;
    int values[10001];
    int i, j;
    cin >> n;  

    for(i = 0; i < n; i++)
        cin >> values[i];

    for(i = n-1; i >= 0; i--){
        if(i == 0){
            cout << values[i];
            break;
        }
        cout << values[i] << " ";
    }
    cout << endl;

    int desl = 1;
    for(i = desl%n; i < n+(desl%n); i++){
        if(i == n+(desl%n)-1){
            cout << values[i%n];
            break;
        }
        cout << values[i%n] << " ";
    }
    cout << endl;

    // Bubble sort
    int aux;
    for(i = 0; i < n; i++){
        for(j = i+1; j < n; j++)
            if(values[i] < values[j]){
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
            }
        cout << values[i] << " ";
    }
    cout << endl;

    return 0;
}