interface Collection {
	void add(Object obj);
	void clear();
	void size();
	void addAll(Collection obj);
	void contains(Object obj);
	void isEmpty();
	void remove(Object obj);
}



class MyArrayList implements Collection{
}

class MyQueue implements Collection{
}


User[] users;
users = new User[10];
users[0] = new User();
.
.
.
.
users[9] = new User();



User[] users2;
users = new User[200];

for(int i=0; i<users.length; i++)
	users2[i] = users[i];

users = users2;


users3 = new User[400];
for(int i=0; i<users2.length; i++)
	users3[i] = users2[i];

users







