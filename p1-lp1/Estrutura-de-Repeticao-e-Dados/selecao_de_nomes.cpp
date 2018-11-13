#include <iostream>
#include <ctype.h>

using namespace std;

void search(const char matrix[][11], char c){
    char letter;
    c = toupper(c);
    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            letter = toupper(matrix[i][j]);
            if(letter == c){
                cout << matrix[i] << "\n";
                break;
            }
        }
    }
}

int main(){

    char names[10][11], character;
    for(int i = 0; i < 10; i++)
        cin >> names[i];

    cin >> character;
    search(names, character);

    return 0;
}