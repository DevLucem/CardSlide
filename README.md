# Card Slide ![phase](https://camo.githubusercontent.com/cfcaf3a99103d61f387761e5fc445d9ba0203b01/68747470733a2f2f7472617669732d63692e6f72672f6477796c2f657374612e7376673f6272616e63683d6d6173746572) [![](https://jitpack.io/v/Lucem-Anb/CardSlide.svg)](https://jitpack.io/#Lucem-Anb/CardSlide)
This is a twitched animation that slides view from any side of the screen with a card effect
This library extends `View` and adopts all methods used by the `FrameLayout`

### Illustration
![Card Slide Preview](https://anbinsane.files.wordpress.com/2018/07/gif-first.gif)

### Implementation
Add jitpack to repositories in the root build.gradle file
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add this dependency line in your build.gradle **app level**

```
dependencies {
	implementation 'com.github.Lucem-Anb:CardSlide:1.0.1'
}
```

### Usage
Wrap your view with the class `SliderAnimate`

```
<com.lucem.anb.cardslide.SliderAnimate
	android:layout_width="wrap_content"
        android:layout_gravity="center"
        app:start="top_left"
        android:id="@+id/slider_animate"
        android:layout_height="wrap_content">

        <!--Your views will be placed here-->
        <ImageView
            android:layout_width="160dp"
            android:contentDescription="@string/image"
            android:src="@drawable/ic_launcher"
            android:layout_height="160dp" />
		
</com.lucem.anb.cardslide.SliderAnimate>
```

Initialize the animation in your java class

`findViewById(R.id.slider_animate).startSlide()`


### Customisation

Define the starting point of the animation

in design:   `app:start="top_left"`

in activity: `animate.setStartPoint(SliderAnimate.TOP_LEFT);`


## Latest Version: 1.0.2
