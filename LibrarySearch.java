package Module2;

import java.util.Arrays;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class LibrarySearch {
    public static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equals(title)) return b;
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareTo(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "C Programming", "Dennis Ritchie"),
            new Book(2, "Java Basics", "James Gosling"),
            new Book(3, "Python Crash Course", "Eric Matthes")
        };

        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title)); // For binary search

        Book found = linearSearch(books, "Java Basics");
        System.out.println("Linear Search: " + (found != null ? found.title : "Not Found"));

        found = binarySearch(books, "C Programming");
        System.out.println("Binary Search: " + (found != null ? found.title : "Not Found"));
    }
}
