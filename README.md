# Challenge - About polymorphism

We're going to implement an application to register our favourite songs and podcasts, modelling the classes using the concepts of object orientation: abstraction, inheritance, encapsulation and polymorphism.

### Notes Important in CODE:

This class "MeusFavoritos" will receive a variable of type "Audio" and will behave differently depending on what is passed in this inclusion, so we work with polymorphism.

![b2042e0a34ea62bcc523654ad1cd24dc](https://github.com/RicardoPereiraDev/Polimorfismo_Spotify_joke/assets/155699805/32cd7859-1130-4aff-b04c-02e2b6fc3a89)

## 🔨 Project goals:

- Create a class **Audio** with the attributes(Title, totalReproducoes, totalCurtidas and classificacao).

- Use encapsulation, left the private attributes and creating the getters and setters to access and modify the attributes.

- Create two methods without return: curte() and reproduz(), that will increment the variables totalCurtidas and totalReproducoes, respectively.

- Organise the code on packages

- Create a class **Musica** extending of Audio, with the additional attributes **album**, **cantor** and **genero**.

- Create a class **Podcast** extending of Audio, with the additional attributes **apresentador** and **description**.

- Create a class Principal and instantiate an object of type Music and other of type Podcast, filling in their attributes;

-  Create a loop to call the likes() and plays() methods in order to simulate a large number of plays and likes.

- Overwrite the *getRank* method in the Music class, defining that if it has more than 2000 **plays** the rank will be 10 and for lower values the rank will be 8.

- Overwrite the *getRank* method in the Podcast class, defining that if it has more than 500 **likes** the rank will be 10 and for lower values, the rank will be 7.

- Create a class called **PreferredMusic** or just **Preferences**, with a void method called *includes*, which will receive an Audio as a parameter.

- In the includes method, we'll work with polymorphism, where we'll use *getRank* (according to the subclass that is passed here as a parameter) to display a message. 
  For a rating of 9 or more, we'll print a message on the terminal and if it's lower, we'll print another message.

- Finalise by instantiating an object of type **PreferredMusic** or **Preferences** and including the music and podcast instantiated previously.


<p></p>

Example/Suggestion of a message to display for ratings above and below 9.

<p></p>

![mensagem](https://user-images.githubusercontent.com/66698429/225436483-20234ade-8dbd-4136-99be-d255fe20e5a4.PNG)
