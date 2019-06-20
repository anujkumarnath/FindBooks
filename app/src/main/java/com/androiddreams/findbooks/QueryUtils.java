package com.androiddreams.findbooks;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class QueryUtils {
    private static String GOOGLE_BOOKS_JSON_RESPONSE = "{\n" +
                " \"kind\": \"books#volumes\",\n" +
                " \"totalItems\": 1959,\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"GOVOCwAAQBAJ\",\n" +
                "   \"etag\": \"RGviFmJ2MCg\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/GOVOCwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Python Machine Learning\",\n" +
                "    \"authors\": [\n" +
                "     \"Sebastian Raschka\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Packt Publishing Ltd\",\n" +
                "    \"publishedDate\": \"2015-09-23\",\n" +
                "    \"description\": \"Unlock deeper insights into Machine Leaning with this vital guide to cutting-edge predictive analytics About This Book Leverage Python's most powerful open-source libraries for deep learning, data wrangling, and data visualization Learn effective strategies and best practices to improve and optimize machine learning systems and algorithms Ask – and answer – tough questions of your data with robust statistical models, built for a range of datasets Who This Book Is For If you want to find out how to use Python to start answering critical questions of your data, pick up Python Machine Learning – whether you want to get started from scratch or want to extend your data science knowledge, this is an essential and unmissable resource. What You Will Learn Explore how to use different machine learning models to ask different questions of your data Learn how to build neural networks using Keras and Theano Find out how to write clean and elegant Python code that will optimize the strength of your algorithms Discover how to embed your machine learning model in a web application for increased accessibility Predict continuous target outcomes using regression analysis Uncover hidden patterns and structures in data with clustering Organize data using effective pre-processing techniques Get to grips with sentiment analysis to delve deeper into textual and social media data In Detail Machine learning and predictive analytics are transforming the way businesses and other organizations operate. Being able to understand trends and patterns in complex data is critical to success, becoming one of the key strategies for unlocking growth in a challenging contemporary marketplace. Python can help you deliver key insights into your data – its unique capabilities as a language let you build sophisticated algorithms and statistical models that can reveal new perspectives and answer key questions that are vital for success. Python Machine Learning gives you access to the world of predictive analytics and demonstrates why Python is one of the world's leading data science languages. If you want to ask better questions of data, or need to improve and extend the capabilities of your machine learning systems, this practical data science book is invaluable. Covering a wide range of powerful Python libraries, including scikit-learn, Theano, and Keras, and featuring guidance and tips on everything from sentiment analysis to neural networks, you'll soon be able to answer some of the most important questions facing you and your organization. Style and approach Python Machine Learning connects the fundamental theoretical principles behind machine learning to their practical application in a way that focuses you on asking and answering the right questions. It walks you through the key elements of Python and its powerful machine learning libraries, while demonstrating how to get to grips with a range of statistical models.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781783555147\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1783555149\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 454,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"averageRating\": 5.0,\n" +
                "    \"ratingsCount\": 2,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"2.6.6.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=GOVOCwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=GOVOCwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=GOVOCwAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=1&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=GOVOCwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-GOVOCwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 2702.19,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 2702.19,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=GOVOCwAAQBAJ&rdid=book-GOVOCwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.70219E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 2.70219E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=GOVOCwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Unlock deeper insights into Machine Leaning with this vital guide to cutting-edge predictive analytics About This Book Leverage Python&#39;s most powerful open-source libraries for deep learning, data wrangling, and data visualization Learn ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"vbQlDQAAQBAJ\",\n" +
                "   \"etag\": \"Vr26w+MNwKo\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/vbQlDQAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Introduction to Machine Learning with Python\",\n" +
                "    \"subtitle\": \"A Guide for Data Scientists\",\n" +
                "    \"authors\": [\n" +
                "     \"Andreas C. Müller\",\n" +
                "     \"Sarah Guido\"\n" +
                "    ],\n" +
                "    \"publisher\": \"\\\"O'Reilly Media, Inc.\\\"\",\n" +
                "    \"publishedDate\": \"2016-09-26\",\n" +
                "    \"description\": \"Machine learning has become an integral part of many commercial applications and research projects, but this field is not exclusive to large companies with extensive research teams. If you use Python, even as a beginner, this book will teach you practical ways to build your own machine learning solutions. With all the data available today, machine learning applications are limited only by your imagination. You’ll learn the steps necessary to create a successful machine-learning application with Python and the scikit-learn library. Authors Andreas Müller and Sarah Guido focus on the practical aspects of using machine learning algorithms, rather than the math behind them. Familiarity with the NumPy and matplotlib libraries will help you get even more from this book. With this book, you’ll learn: Fundamental concepts and applications of machine learning Advantages and shortcomings of widely used machine learning algorithms How to represent data processed by machine learning, including which data aspects to focus on Advanced methods for model evaluation and parameter tuning The concept of pipelines for chaining models and encapsulating your workflow Methods for working with text data, including text-specific processing techniques Suggestions for improving your machine learning and data science skills\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781449369897\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1449369898\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 400,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"averageRating\": 3.0,\n" +
                "    \"ratingsCount\": 2,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"3.11.9.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=vbQlDQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=vbQlDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=vbQlDQAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=2&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=vbQlDQAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-vbQlDQAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 2950.0,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 1672.65,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=vbQlDQAAQBAJ&rdid=book-vbQlDQAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.95E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 1.67265E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=vbQlDQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"With this book, you’ll learn: Fundamental concepts and applications of machine learning Advantages and shortcomings of widely used machine learning algorithms How to represent data processed by machine learning, including which data ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"G_mrBwAAQBAJ\",\n" +
                "   \"etag\": \"Hbu/F8wgWjc\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/G_mrBwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Building Machine Learning Systems with Python - Second Edition\",\n" +
                "    \"authors\": [\n" +
                "     \"Luis Pedro Coelho\",\n" +
                "     \"Willi Richert\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Packt Publishing Ltd\",\n" +
                "    \"publishedDate\": \"2015-03-26\",\n" +
                "    \"description\": \"This book primarily targets Python developers who want to learn and use Python's machine learning capabilities and gain valuable insights from data to develop effective solutions for business problems.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781784392888\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"178439288X\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 326,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"2.2.2.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=G_mrBwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=G_mrBwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=G_mrBwAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=3&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=G_mrBwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-G_mrBwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 2988.93,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 2988.93,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=G_mrBwAAQBAJ&rdid=book-G_mrBwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.98893E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 2.98893E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=G_mrBwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"This book primarily targets Python developers who want to learn and use Python&#39;s machine learning capabilities and gain valuable insights from data to develop effective solutions for business problems.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"8_rzBgAAQBAJ\",\n" +
                "   \"etag\": \"gd/SPEUmTCU\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/8_rzBgAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Machine Learning in Python\",\n" +
                "    \"subtitle\": \"Essential Techniques for Predictive Analysis\",\n" +
                "    \"authors\": [\n" +
                "     \"Michael Bowles\"\n" +
                "    ],\n" +
                "    \"publisher\": \"John Wiley & Sons\",\n" +
                "    \"publishedDate\": \"2015-03-30\",\n" +
                "    \"description\": \"This book shows readers how they can successfully analyze data using only two core machine learning algorithms---and how to do so using the popular Python programming language. These algorithms deal with common scenarios faced by all data analysts and data scientists. This book focuses on two algorithm families (linear methods and ensemble methods) that effectively predict outcomes. This type of problem covers a multitude of use cases (what ad to place on a web page, predicting prices in securities markets, detecting credit card fraud, etc.). The focus on two families gives enough room for full descriptions of the mechanisms at work in the algorithms. Then the code examples serve to illustrate the workings of the machinery with specific hackable code. The author will explain in simple terms, using no complex math, how these algorithms work, and will then show how to apply them in Python. He will also provide advice on how to select from among these algorithms, and will show how to prepare the data, and how to use the trained models in practice. The author begins with an overview of the two core algorithms, explaining the types of problems solved by each one. He then introduces a core set of Python programming techniques that can be used to apply these algorithms. The author shows various techniques for building predictive models that solve a range of problems, from simple to complex; he also shows how to measure the performance of each model to ensure you use the right one. The following chapters provide a deep dive into each of the two algorithms: penalized linear regression and ensemble methods. Chapters will show how to apply each algorithm in Python. Readers can directly use the sample code to build their own solutions.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781118961742\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1118961749\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 336,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"1.13.2.0.preview.1\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=8_rzBgAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=8_rzBgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=8_rzBgAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=4&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.co.in/books?id=8_rzBgAAQBAJ&dq=machine+learning+in+python&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Machine_Learning_in_Python.html?hl=&id=8_rzBgAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=8_rzBgAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"This book demonstrates how machine learning can be implemented using the more widely used and accessible Python programming language.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"nG3vDQAAQBAJ\",\n" +
                "   \"etag\": \"adCZKGM4Ilo\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/nG3vDQAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Thoughtful Machine Learning with Python\",\n" +
                "    \"subtitle\": \"A Test-Driven Approach\",\n" +
                "    \"authors\": [\n" +
                "     \"Matthew Kirk\"\n" +
                "    ],\n" +
                "    \"publisher\": \"\\\"O'Reilly Media, Inc.\\\"\",\n" +
                "    \"publishedDate\": \"2017-01-16\",\n" +
                "    \"description\": \"Gain the confidence you need to apply machine learning in your daily work. With this practical guide, author Matthew Kirk shows you how to integrate and test machine learning algorithms in your code, without the academic subtext. Featuring graphs and highlighted code examples throughout, the book features tests with Python’s Numpy, Pandas, Scikit-Learn, and SciPy data science libraries. If you’re a software engineer or business analyst interested in data science, this book will help you: Reference real-world examples to test each algorithm through engaging, hands-on exercises Apply test-driven development (TDD) to write and run tests before you start coding Explore techniques for improving your machine-learning models with data extraction and feature development Watch out for the risks of machine learning, such as underfitting or overfitting data Work with K-Nearest Neighbors, neural networks, clustering, and other algorithms\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781491924105\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1491924101\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 216,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"0.2.1.0.preview.1\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=nG3vDQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=nG3vDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=nG3vDQAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=5&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.co.in/books?id=nG3vDQAAQBAJ&dq=machine+learning+in+python&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Thoughtful_Machine_Learning_with_Python.html?hl=&id=nG3vDQAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=nG3vDQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Gain the confidence you need to apply machine learning in your daily work. With this practical guide, author Matthew Kirk shows you how to integrate and test machine learning algorithms in your code, without the academic subtext.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"sc2qDQAAQBAJ\",\n" +
                "   \"etag\": \"FNHjUqzu9qQ\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/sc2qDQAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Advanced Machine Learning with Python\",\n" +
                "    \"authors\": [\n" +
                "     \"John Hearty\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Packt Publishing Ltd\",\n" +
                "    \"publishedDate\": \"2016-07-28\",\n" +
                "    \"description\": \"Solve challenging data science problems by mastering cutting-edge machine learning techniques in Python About This Book Resolve complex machine learning problems and explore deep learning Learn to use Python code for implementing a range of machine learning algorithms and techniques A practical tutorial that tackles real-world computing problems through a rigorous and effective approach Who This Book Is For This title is for Python developers and analysts or data scientists who are looking to add to their existing skills by accessing some of the most powerful recent trends in data science. If you've ever considered building your own image or text-tagging solution, or of entering a Kaggle contest for instance, this book is for you! Prior experience of Python and grounding in some of the core concepts of machine learning would be helpful. What You Will Learn Compete with top data scientists by gaining a practical and theoretical understanding of cutting-edge deep learning algorithms Apply your new found skills to solve real problems, through clearly-explained code for every technique and test Automate large sets of complex data and overcome time-consuming practical challenges Improve the accuracy of models and your existing input data using powerful feature engineering techniques Use multiple learning techniques together to improve the consistency of results Understand the hidden structure of datasets using a range of unsupervised techniques Gain insight into how the experts solve challenging data problems with an effective, iterative, and validation-focused approach Improve the effectiveness of your deep learning models further by using powerful ensembling techniques to strap multiple models together In Detail Designed to take you on a guided tour of the most relevant and powerful machine learning techniques in use today by top data scientists, this book is just what you need to push your Python algorithms to maximum potential. Clear examples and detailed code samples demonstrate deep learning techniques, semi-supervised learning, and more - all whilst working with real-world applications that include image, music, text, and financial data. The machine learning techniques covered in this book are at the forefront of commercial practice. They are applicable now for the first time in contexts such as image recognition, NLP and web search, computational creativity, and commercial/financial data modeling. Deep Learning algorithms and ensembles of models are in use by data scientists at top tech and digital companies, but the skills needed to apply them successfully, while in high demand, are still scarce. This book is designed to take the reader on a guided tour of the most relevant and powerful machine learning techniques. Clear descriptions of how techniques work and detailed code examples demonstrate deep learning techniques, semi-supervised learning and more, in real world applications. We will also learn about NumPy and Theano. By this end of this book, you will learn a set of advanced Machine Learning techniques and acquire a broad set of powerful skills in the area of feature selection & feature engineering. Style and approach This book focuses on clarifying the theory and code behind complex algorithms to make them practical, useable, and well-understood. Each topic is described with real-world applications, providing both broad contextual coverage and detailed guidance.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781784393830\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1784393835\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 278,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.1.1.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=sc2qDQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=sc2qDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=sc2qDQAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=6&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=sc2qDQAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-sc2qDQAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 2822.55,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 2822.55,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=sc2qDQAAQBAJ&rdid=book-sc2qDQAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.82255E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 2.82255E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=sc2qDQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Solve challenging data science problems by mastering cutting-edge machine learning techniques in Python About This Book Resolve complex machine learning problems and explore deep learning Learn to use Python code for implementing a range of ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"OOotAgAAQBAJ\",\n" +
                "   \"etag\": \"OF4c28rji1I\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/OOotAgAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Learning scikit-learn: Machine Learning in Python\",\n" +
                "    \"authors\": [\n" +
                "     \"Raul Garreta\",\n" +
                "     \"Guillermo Moncecchi\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Packt Publishing Ltd\",\n" +
                "    \"publishedDate\": \"2013-11-25\",\n" +
                "    \"description\": \"The book adopts a tutorial-based approach to introduce the user to Scikit-learn.If you are a programmer who wants to explore machine learning and data-based methods to build intelligent applications and enhance your programming skills, this the book for you. No previous experience with machine-learning algorithms is required.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781783281947\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1783281944\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 100,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.1.1.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=OOotAgAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=OOotAgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=OOotAgAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=7&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=OOotAgAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-OOotAgAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 1168.19,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 683.39,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=OOotAgAAQBAJ&rdid=book-OOotAgAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 1.16819E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 6.8339E8,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=OOotAgAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"The book adopts a tutorial-based approach to introduce the user to Scikit-learn.If you are a programmer who wants to explore machine learning and data-based methods to build intelligent applications and enhance your programming skills, this ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"-u4mDwAAQBAJ\",\n" +
                "   \"etag\": \"cxrtC2hNzQc\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/-u4mDwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Mastering Machine Learning with Python in Six Steps\",\n" +
                "    \"subtitle\": \"A Practical Implementation Guide to Predictive Data Analytics Using Python\",\n" +
                "    \"authors\": [\n" +
                "     \"Manohar Swamynathan\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Apress\",\n" +
                "    \"publishedDate\": \"2017-06-05\",\n" +
                "    \"description\": \"Master machine learning with Python in six steps and explore fundamental to advanced topics, all designed to make you a worthy practitioner. This book’s approach is based on the “Six degrees of separation” theory, which states that everyone and everything is a maximum of six steps away. Mastering Machine Learning with Python in Six Steps presents each topic in two parts: theoretical concepts and practical implementation using suitable Python packages. You’ll learn the fundamentals of Python programming language, machine learning history, evolution, and the system development frameworks. Key data mining/analysis concepts, such as feature dimension reduction, regression, time series forecasting and their efficient implementation in Scikit-learn are also covered. Finally, you’ll explore advanced text mining techniques, neural networks and deep learning techniques, and their implementation. All the code presented in the book will be available in the form of iPython notebooks to enable you to try out these examples and extend them to your advantage. What You'll Learn Examine the fundamentals of Python programming language Review machine Learning history and evolution Understand machine learning system development frameworks Implement supervised/unsupervised/reinforcement learning techniques with examples Explore fundamental to advanced text mining techniques Implement various deep learning frameworks Who This Book Is For Python developers or data engineers looking to expand their knowledge or career into machine learning area. Non-Python (R, SAS, SPSS, Matlab or any other language) machine learning practitioners looking to expand their implementation skills in Python. Novice machine learning practitioners looking to learn advanced topics, such as hyperparameter tuning, various ensemble techniques, natural language processing (NLP), deep learning, and basics of reinforcement learning.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781484228661\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1484228669\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 358,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.2.2.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=-u4mDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=-u4mDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=-u4mDwAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=8&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=-u4mDwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book--u4mDwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 3197.8,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 3197.8,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=-u4mDwAAQBAJ&rdid=book--u4mDwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 3.1978E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 3.1978E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Mastering_Machine_Learning_with_Python_i-sample-epub.acsm?id=-u4mDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.co.in/books/download/Mastering_Machine_Learning_with_Python_i-sample-pdf.acsm?id=-u4mDwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=-u4mDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"What You&#39;ll Learn Examine the fundamentals of Python programming language Review machine Learning history and evolution Understand machine learning system development frameworks Implement supervised/unsupervised/reinforcement learning ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"0nc5DwAAQBAJ\",\n" +
                "   \"etag\": \"44y5sRjH9KI\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/0nc5DwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Python Machine Learning By Example\",\n" +
                "    \"authors\": [\n" +
                "     \"Yuxi (Hayden) Liu\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Packt Publishing Ltd\",\n" +
                "    \"publishedDate\": \"2017-05-31\",\n" +
                "    \"description\": \"Take tiny steps to enter the big world of data science through this interesting guide About This Book Learn the fundamentals of machine learning and build your own intelligent applications Master the art of building your own machine learning systems with this example-based practical guide Work with important classification and regression algorithms and other machine learning techniques Who This Book Is For This book is for anyone interested in entering the data science stream with machine learning. Basic familiarity with Python is assumed. What You Will Learn Exploit the power of Python to handle data extraction, manipulation, and exploration techniques Use Python to visualize data spread across multiple dimensions and extract useful features Dive deep into the world of analytics to predict situations correctly Implement machine learning classification and regression algorithms from scratch in Python Be amazed to see the algorithms in action Evaluate the performance of a machine learning model and optimize it Solve interesting real-world problems using machine learning and Python as the journey unfolds In Detail Data science and machine learning are some of the top buzzwords in the technical world today. A resurging interest in machine learning is due to the same factors that have made data mining and Bayesian analysis more popular than ever. This book is your entry point to machine learning. This book starts with an introduction to machine learning and the Python language and shows you how to complete the setup. Moving ahead, you will learn all the important concepts such as, exploratory data analysis, data preprocessing, feature extraction, data visualization and clustering, classification, regression and model performance evaluation. With the help of various projects included, you will find it intriguing to acquire the mechanics of several important machine learning algorithms – they are no more obscure as they thought. Also, you will be guided step by step to build your own models from scratch. Toward the end, you will gather a broad picture of the machine learning ecosystem and best practices of applying machine learning techniques. Through this book, you will learn to tackle data-driven problems and implement your solutions with the powerful yet simple language, Python. Interesting and easy-to-follow examples, to name some, news topic classification, spam email detection, online ad click-through prediction, stock prices forecast, will keep you glued till you reach your goal. Style and approach This book is an enticing journey that starts from the very basics and gradually picks up pace as the story unfolds. Each concept is first succinctly defined in the larger context of things, followed by a detailed explanation of their application. Every concept is explained with the help of a project that solves a real-world problem, and involves hands-on work—giving you a deep insight into the world of machine learning. With simple yet rich language—Python—you will understand and be able to implement the examples with ease.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781783553129\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"178355312X\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 254,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.2.2.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=0nc5DwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=0nc5DwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=0nc5DwAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=9&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=0nc5DwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-0nc5DwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 3217.85,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 3217.85,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=0nc5DwAAQBAJ&rdid=book-0nc5DwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 3.21785E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 3.21785E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=0nc5DwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"This book is your entry point to machine learning. This book starts with an introduction to machine learning and the Python language and shows you how to complete the setup.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"kIhQDwAAQBAJ\",\n" +
                "   \"etag\": \"USbP/CFVKgU\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/kIhQDwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Machine Learning with Python Cookbook\",\n" +
                "    \"subtitle\": \"Practical Solutions from Preprocessing to Deep Learning\",\n" +
                "    \"authors\": [\n" +
                "     \"Chris Albon\"\n" +
                "    ],\n" +
                "    \"publisher\": \"\\\"O'Reilly Media, Inc.\\\"\",\n" +
                "    \"publishedDate\": \"2018-03-09\",\n" +
                "    \"description\": \"This practical guide provides nearly 200 self-contained recipes to help you solve machine learning challenges you may encounter in your daily work. If you’re comfortable with Python and its libraries, including pandas and scikit-learn, you’ll be able to address specific problems such as loading data, handling text or numerical data, model selection, and dimensionality reduction and many other topics. Each recipe includes code that you can copy and paste into a toy dataset to ensure that it actually works. From there, you can insert, combine, or adapt the code to help construct your application. Recipes also include a discussion that explains the solution and provides meaningful context. This cookbook takes you beyond theory and concepts by providing the nuts and bolts you need to construct working machine learning applications. You’ll find recipes for: Vectors, matrices, and arrays Handling numerical and categorical data, text, images, and dates and times Dimensionality reduction using feature extraction or feature selection Model evaluation and selection Linear and logical regression, trees and forests, and k-nearest neighbors Support vector machines (SVM), naïve Bayes, clustering, and neural networks Saving and loading trained models\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781491989333\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1491989335\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 366,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.3.4.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=kIhQDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=kIhQDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.co.in/books?id=kIhQDwAAQBAJ&printsec=frontcover&dq=machine+learning+in+python&hl=&cd=10&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=kIhQDwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-kIhQDwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 2725.8,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 2725.8,\n" +
                "     \"currencyCode\": \"INR\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=kIhQDwAAQBAJ&rdid=book-kIhQDwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.7258E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 2.7258E9,\n" +
                "       \"currencyCode\": \"INR\"\n" +
                "      }\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"IN\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=kIhQDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"This practical guide provides nearly 200 self-contained recipes to help you solve machine learning challenges you may encounter in your daily work.\"\n" +
                "   }\n" +
                "  }\n" +
                " ]\n" +
                "}";

    private QueryUtils() {}

    public static ArrayList<Book> readItemsFromJson(/*String jsonResponse*/) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            /**
             * getting the root JSON object
             */
            JSONObject root = new JSONObject(GOOGLE_BOOKS_JSON_RESPONSE/*jsonResponse*/);
            if (root == null)
                return null;
            /**
             * getting the array with key "items"
             */
            JSONArray itemsArray = root.optJSONArray("items");
            for (int i = 0; i < itemsArray.length(); i++) {
                /**
                 * get individual item from the array of items
                 */
                JSONObject item = itemsArray.optJSONObject(i);
                /**
                 * getting JSON object with key "volumeInfo"
                 */
                JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                String title = volumeInfo.optString("title");
                String subTitle = volumeInfo.optString("subtitle");
                JSONArray authorsArray = volumeInfo.optJSONArray("authors");
                String authors = authorsArray.optString(0);
                if (authorsArray.length() > 0)
                for (int j = 1; j < authorsArray.length(); j++) {
                    authors += ", " + authorsArray.optString(j);
                }
                String publisher = volumeInfo.optString("publisher");
                String rating = volumeInfo.optString("averageRating");

                books.add(new Book(title, subTitle, authors, publisher, rating));
            }
        } catch (JSONException e) {
            //TODO: handle exception here
        }
        return books;
    }
}
