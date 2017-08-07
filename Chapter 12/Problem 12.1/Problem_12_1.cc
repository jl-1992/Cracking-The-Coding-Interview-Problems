#include <iostream>
#include <fstream>
using namespace std;

void print_last_k_lines(ifstream &in, int k){
	string line;
	int num_lines=0;
	while(getline(in,line))
		++num_lines;
	in.clear();
	in.seekg(0,ios::beg);
	for(int i=0;i<num_lines;++i){
		getline(in,line);
		if(i>=num_lines-k)
			cout << line << endl;
	}
}

int main(){
	ifstream in("Sample.txt");
	print_last_k_lines(in,3);
	return 0;
}