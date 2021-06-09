class Book():
    def __init__(self,id,name,author,cost):
        self.book_id = id
        self.name = name
        self.author = author
        self.cost = cost

class BookDict():
    def __init__(self):
        self.bookdict = {}

    def insert(self, id, name, author, cost):
        temp = Book(id, name, author, cost)
        if id in self.bookdict:
            return False
        self.bookdict[id] = temp
        return True

    def delete(self, id):
        if id in self.bookdict:
            del self.bookdict[id]
            return True
        return False

    def search(self,id):
        if id in self.bookdict:
            return self.bookdict[id]
        else:
            return None

    def listItems(self):
        for key,value in self.bookdict.items():
            print("")
            print("Book id:",value.book_id)
            print("Book Name:",value.name)
            print("Book Author:",value.author)
            print("Book Cost:",value.cost)

if __name__ == "__main__":
    bookobj = BookDict()
    while True:
        print("")
        print("1.Add Book")
        print("2.Remove Book")
        print("3.Search Book")
        print("4.List all books")
        print("5.Quit")
        print("Select one of the above option")
        choice = int(input())
        if choice==1:
            print("Enter Book Details")
            print("Enter Book Id");
            id = input();
            print("Enter Book Name");
            name = input();
            print("Enter Book Author");
            author = input();
            print("Enter Book Cost");
            cost = int(input());
            if bookobj.insert(id,name,author,cost):
                print("Book added successfully")
            else:
                print("Book cannot be inserted")
        elif choice==2:
            print("Enter Book Details")
            print("Enter Book Id");
            id = input();
            if bookobj.delete(id):
                print("Book removed successfully")
            else:
                print("Book cannot be removed")
        elif choice==3:
            print("Enter Book Details")
            print("Enter Book Id");
            id = input();
            searchres = bookobj.search(id)
            if searchres is not None:
                print("")
                print("Book id:",searchres.book_id)
                print("Book Name:",searchres.name)
                print("Book Author:",searchres.author)
                print("Book Cost:",searchres.cost)
            else:
                print("Book not found")
        elif choice==4:
            print("List of all books")
            bookobj.listItems()
        elif choice==5:
            break
        else:
            continue
