### 1. Start a new project - a bunch of file will be created.
 Main.activity.kt -  tells how everything will work.
 activity-main.xml - things( text, button, images...) to be included known as widgets.
 res
   |__ drawable -for images
   |__ layout - activity-main.xml
   |__ mipmap - launcher icons
   |__ values 
   	 |__  for declaration
   	 |__ colors.xml
   	 |__ strings.xml - Eg need to convert the text from English to Hindi
   	 |__ styles.xml  - styling of app
   |__ Gradle scripts - does multiple test run and convert the program file into apk

### 2. Adding XML layouts
  How to add widgets ?
  Layouts  - constraint Layout
     - guideline
     - Linear Layout
     - Frame Layout
     - Table Layout
     - Table Row
  here, using Constarint Layout for designing and code for it is
      <TextView 
          android:id="@+id/helperMessage"			- Every view has a unique id
          android:layout_width="wrap_content"		- provide the width as the width of text ie to wrap it inside
          android:layout_height="wrap_content"		- provide the height as the height of text ie to wrap it inside
          android:layout_marginTop="60dp"			- using dp for margin is preferable than px as it may differ in high and low intesity pixel devices.
          android:text="@string/enter_the_name"		- here warning will come "extract to strings.xml" , it helps in need to convert the text from one language to another
          app:layout_constraintEnd_toEndOf="parent"	- its end(left) , start(right) , top parent is parent i.e the edge of screen. 
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toTopOf="parent" />
      <EditText
          android:id="@+id/nameInput"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_marginTop="30dp"
          android:ems="10"
          android:inputType="textPersonName"
          android:hint="@string/akshay"
          android:textAlignment="center" 			- to align the text in center
          android:gravity="center_horizontal"		- specifies how an object should position its content on both X and Y axis. Values are top, bottom, left, right, center, center_vertical, center_horizonta
          app:layout_constraintEnd_toEndOf="parent"	- left parent is left edge of screen
          app:layout_constraintStart_toStartOf="parent"	- right parent is right edge of screen
          app:layout_constraintTop_toBottomOf="@+id/helperMessage" - top parent is view present above of it i.e. helperMessage



      <Button
          android:id="@+id/button"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_marginTop="60dp"
          android:text="@string/create_birthday_card"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintStart_toStartOf="parent"
          android:textAllCaps="false"			- to make the text appear as actually set for it.
          android:padding="30dp"				- used to create space around an element's content
          app:layout_constraintTop_toBottomOf="@+id/nameInput" />

Useful commands -
Shift+F6  - change the name everywhere in one go.
