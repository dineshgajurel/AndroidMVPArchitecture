# Android MVP Architecture
This repository has two branches **master** and **mvp_with_rx_and_dagger**. **Master** branch includes Android MVP architecture without using Dagger, RxJava, RxAndroid and branch **mvp_with_rx_and_dagger** includes Android MVP architecture using Dagger, RxJava, RxAndroid
In this repository, there is Retrofit, OkHttp for API purpose. AndroidMVPArchitecture is developed for beginners who are well known about basic Android application development and wants to use trending MVP Architecture with or without **Rx and Dagger**. There is different type of implementation in different branches. You can simply clone the project and checkout to any above mentioned branches and learn both type of implementation.

**To switch between the branches simply type:**<br/>
i) from master to mvp_with_rx_and_dagger
  >git checkout mvp_with_rx_and_dagger
  
ii)from mvp_with_rx_and_dagger to master
  > git checkout master

  **MVC vs MVP**
  
  
![MVC vs MVP](http://www.techyourchance.com/wp-content/uploads/2015/06/MVC_MVP.png)
 
 # What is MVP?
 
![MVP Pattern](http://gwb.blob.core.windows.net/rajeshpillai/figure_1.jpg)

MVP is a user interface architectural pattern engineered to facilitate automated unit testing and improve the separation of concerns in presentation logic:

The model is an interface defining the data to be displayed or otherwise acted upon in the user interface.
The view is a passive interface that displays data (the model) and routes user commands (events) to the presenter to act upon that data.
The presenter acts upon the model and the view. It retrieves data from repositories (the model), and formats it for display in the view.

**source:** https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter

# Important Links:
https://medium.com/@cervonefrancesco/model-view-presenter-android-guidelines-94970b430ddf

https://github.com/googlesamples/android-architecture

https://code.tutsplus.com/tutorials/an-introduction-to-model-view-presenter-on-android--cms-26162

https://stackoverflow.com/questions/2056/what-are-mvp-and-mvc-and-what-is-the-difference

https://msdn.microsoft.com/en-us/library/ff649571.aspx


**Feel free to submit any type of issues and suggestions for improving the coding standard**

**Happy Coding!!!** ![](https://github.com/nawinkhatiwada/AndroidMVPArchitecture/blob/master/app/src/main/res/drawable/happiness.png)


