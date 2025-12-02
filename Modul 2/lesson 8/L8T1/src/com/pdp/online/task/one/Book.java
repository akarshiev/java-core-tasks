package com.pdp.online.task.one;

public record Book(String name, String author, int pageCount, double price) {

    public Book {

        if (name == null || name.isBlank()) {
            System.out.println("name bo'sh bo'lishi mumkin emas!");
        }

        if (author == null || author.isBlank()) {
            System.out.println("Author bo'sh bo'lishi mumkin emas!");
        }

        if (pageCount <= 0) {
            System.out.println("PageCount 0 dan katta bo'lishi kerak!");
        }
    }
}
