/*Object Oriented Programming Concepts used:
Classes and Objects: Book, BookList, BMS this are three classes used in program
Encapsulation- The above mentioned classes encapsulate various member variables and member functions
Aggregation - class Booklist "has a" class Book. So class Booklist and class Book are representing aggregation.
Dependency - Class BMS has dependency on class BookList for creating a list of book and class Scanner for taking input also on class Integer to convert input string to int.
*/
//This program implements a book management system using list.
import java.util.*;
class Book{
  String book_id = "";
  String name = "";
  String author = "";
  int cost = 0;
  Book next = null;
  public Book()
  {
  }
  public Book(String id, String name, String author, int cost)
  {
    this.book_id = id;
    this.name = name;
    this.author = author;
    this.cost = cost;
    this.next = null;
  }
  public void displayBook()
  {
    System.out.println();
    System.out.println("Book id:"+this.book_id);
    System.out.println("Book Name:"+this.name);
    System.out.println("Book Author:"+this.author);
    System.out.println("Prize:"+this.cost);
  }
}
class BookList{
  Book head;
  Book tail;
  public BookList()
  {
    head = new Book();
    tail = head;
  }
  public boolean insert(String id, String name, String author, int cost)
  {
    Book cur = this.tail;
    Book temp = new Book(id,name,author,cost);
    cur.next = temp;
    this.tail = temp;
    return true;
  }
  public boolean delete(String id)
  {
    Book cur = head.next;
    Book prev = head;
    while(cur!=null)
    {
      if(cur.book_id.equals(id))
      {
        prev.next = cur.next;
        if(cur.next==null)
          this.tail=prev;
        cur.next = null;
        return true;
      }
      else
      {
        prev = cur;
        cur = cur.next;
      }
    }
    return false;
  }
  public Book search(String id)
  {
    Book cur = this.head.next;
    while(cur!=null)
    {
      if(cur.book_id.equals(id))
      {
        return cur;
      }
      else
        cur = cur.next;
    }
    return cur;
  }
  public void display()
  {
    Book cur = this.head.next;
    while(cur!=null)
    {
      System.out.println();
      System.out.println("Book id:"+cur.book_id);
      System.out.println("Book Name:"+cur.name);
      System.out.println("Book Author:"+cur.author);
      System.out.println("Prize:"+cur.cost);
      cur = cur.next;
    }
  }
}
class BMS{
  public static void main(String args[])
  {
    BookList booksystem = new BookList();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while(!exit)
    {
      System.out.println();
      System.out.println("1.Add book");
      System.out.println("2.Remove book");
      System.out.println("3.Search book");
      System.out.println("4.List all books");
      System.out.println("5.Quit");
      System.out.println("Select one of the above option:");
      int choice;
      choice = Integer.parseInt(sc.nextLine());
      switch (choice){
        case 1:
        {
          System.out.println("Enter Book Details");
          System.out.println("Enter Book Id");
          String book_id = sc.nextLine();
          System.out.println("Enter Book Name");
          String name = sc.nextLine();
          System.out.println("Enter Book Author");
          String author = sc.nextLine();
          System.out.println("Enter Book Cost");
          int cost = Integer.parseInt(sc.nextLine());
          if(booksystem.insert(book_id, name, author, cost))
            System.out.println("Book added successfully");
          else
            System.out.println("Book could not be inserted");
          break;
        }
        case 2:
        {
          System.out.println("Enter Book Id");
          String book_id = sc.nextLine();
          if(booksystem.delete(book_id))
            System.out.println("Book removed successfully");
          else
            System.out.println("Book could not be removed");
          break;
        }
        case 3:
        {
          System.out.println("Enter Book Id");
          String book_id = sc.nextLine();
          Book searchobj = booksystem.search(book_id);
          if(searchobj!=null)
            searchobj.displayBook();
          else
            System.out.println("Book Not found");
          break;
        }
        case 4:
        {
          System.out.println("List of Books");
          booksystem.display();
          break;
        }
        case 5:
        {
          exit = true;
          break;
        }
        default:
          break;
      }
    }
  }
}
