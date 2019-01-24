#include <iostream>

using namespace std;

int fib(int n){

  if(n < 2){
    return n;
  }
  else{
    return fib(n-1) + fib(n-2);
  }

}

int main(){

  int n;
  cout << "Dame el numero" << endl;
  cin >> n;

  cout << fib(n) << endl;
    return 0;
}
 
