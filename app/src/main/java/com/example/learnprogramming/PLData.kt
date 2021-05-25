package com.example.learnprogramming

object PLData {
    private val programmingNames = arrayOf(
        "Python",
        "Javascript",
        "Java",
        "C++",
        "Go Lang",
        "C#",
        "SQL",
        "Dart",
        "R",
        "PHP"
    )

    private val programmingDetails = arrayOf(
        "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects. Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library",
        "Along HTML and CSS, Javascript is the programming language that built the Internet. So, it’s a pretty big deal. Universally known as the language of web developers,  javascript is a feature-rich object-based scripting language. Featuring asynchronous event handling and crisp syntax, it has found widespread use in the field of web development. What started off as a simple client-side scripting language, is now a highlight within the web development community featuring multiple frameworks for both backend and frontend development.",
        "Owned by the Oracle Corporation, Java is one of the oldest, most common, in-demand computer programming languages in use today. Well, think of some of your favorite web apps and games. It’s highly likely that Java plays a huge role in the code that makes them work. Another important factor which has kept Java’s magic intact among web development companies is its independence from platforms. This helps developers to essentially “write once, work anywhere”(WORA). Java is everywhere and the demand for strong developers is literally high.",
        "Sequel to C, C++ is the pioneer of the modern world’s most used programming languages and root of other programming languages such as C#, Java, and JavaScript. It is a simple, yet powerful programming language that provides a structured approach. Both C and C++ are considered high-performance languages and are widely used in developing applications where performance is a critical issue. Though old, the practical applications of C++, is the reason why C++ is in this top 10 programming languages list. ",
        "Developed by the tech giant Google itself, Go is one of the latest players in the programming platform. It is an open-source language which makes it easy to create simple, secure, and productive software. It combines the best aspects of functional and object-oriented programming, as well as features a valuable set of inbuilt development tools. ",
        "Created by Microsoft, C# is considered to be one of the most powerful programming languages in the Dot NET framework. It is a powerful, flexible language that gives you a comprehensive programming foundation which is applicable to Java, Objective-C, PHP, and more. You can think of C# as a blend of the C++ and the Java language but Anders Hejlsberg, the creator of C#, says the language is more like C++ than Java. ",
        "Structured Query Language, or SQL, is a special-purpose programming language used to interact with databases. It works by analyzing and understanding databases consisting of fields of data within tables. Many fortune 500 companies have built their own high-performance database systems, using SQL to query data and perform analysis. With over 260,000 repositories on Github, it eclipses the popularity of a lot of the newer languages when it comes to the Data Analytics field.",
        "Developed by Google, Dart is an easy to learn, iterative, open-source programming language meant for server-side as well as browser-side programming. While most frameworks share a portion of codebase on different platforms, Dart allows you to write a single application for both Android and iOS and allows code sharing between mobile applications on different platforms.",
        "R was designed by statisticians and was specialized for statistical computing, and thus is known as the “lingua franca of statistics”. As technology improves, the data companies or research institutions collect has become more and more complex, and R has been adopted by many as the language of choice to analyze data. This language is not only open source but also comes with cross-platform compatibility and a community with over 6 Million Repositories on GitHub.",
        "PHP is used by 79% of all the websites whose server-side programming language we know. It is mainly used for developing dynamic and data-heavy websites and applications. It has been the cornerstone of the web for a long time. PHP is a simple, fast and platform-independent general-purpose programming language with over 631,000 repositories on GitHub."
    )
    private val programmingImages = intArrayOf(
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.java,
        R.drawable.cpp,
        R.drawable.golang,
        R.drawable.csharp,
        R.drawable.sql,
        R.drawable.dart,
        R.drawable.r,
        R.drawable.php
    )

    val listData: ArrayList<PL>
        get() {
            val list = arrayListOf<PL>()
            for (position in programmingNames.indices) {
                val pl = PL()
                pl.name = programmingNames[position]
                pl.detail = programmingDetails[position]
                pl.photo = programmingImages[position]
                list.add(pl)
            }
            return list
        }
}