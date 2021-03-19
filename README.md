<h1 align="center">
  <br>
  <img src="https://drive.google.com/uc?export=view&id=1Ip_9UbjrU9xyS--ZJyJiFo5guv5gyZai">
  <br>
  <br>
</h1>
  
  <h4 align="center">A trivia game application based on themes from Norse Mythology </h4>
  <p align="center">
<img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white">
<img src="https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white">
<img src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white">
<a href="https://open.spotify.com/playlist/5qqgCCS6HPBkQJIQgK3g4P?si=sx8oqvlaRX-9hngryZFTqw">
    <img src="https://img.shields.io/badge/Spotify-1ED760?&style=for-the-badge&logo=spotify&logoColor=white">
  </a>
</p>

<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-norse">About Norse</a>
      <ul>
        <li><a href="#description">Description</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#features-and-functions">Features and Functions</a></li>
    <li><a href="#concept-development">Concept Development</a>
     <ul>
        <li><a href="#ideation">Ideation</a></li>
        <li><a href="#wireframes">Wireframes</a></li>
       <li><a href="#user-flow">User Flow</a></li>
      </ul>
      </li>
    <li><a href="#development-process">Development Process</a>
     <ul>
        <li><a href="#implementation">Implementation</a></li>
        <li><a href="#peer-reviews">Peer Reviews</a></li>
      </ul>
    </li>
    <li><a href="#demo-video">Demo Video</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#author">Author</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

## About Norse

### Description

Norse is a trivia game application which touches on questions based on Norse Mythology.

### Built With

* [Android Studio](https://developer.android.com/studio)
* [Kotlin](https://kotlinlang.org/)
* [Github](https://github.com/)

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

Ensure that you have the latest version of `Android Studio` installed on your machine.
The `Kotlin` plugin will also be required.

### Installation

Here are a couple of ways to clone this repo:

1. Android Studio </br>
`Android Studio` -> `File` -> `New` -> `From Version Control` -> `Git`</br>
Enter `https://github.com/ClaudiaAF/NorseTriviaGame.git` into the URL field and press the `Clone` button.

2. Command-line + Android Studio </br>
Run the following in the command-line to clone the project:
   ```sh
   git clone https://github.com/ClaudiaAF/NorseTriviaGame.git
   ```
Open `Android Studio` and select `File | Open...` from the menu. Select cloned directory and press `Open` button

## Features and Functions

### Features

* User is able to select one out of three categories
  - The categories are Places, Gods, and Weaponry
* User can add their name
* See the highest score in each category
* Increase you knowledge in Norse Mythology  
* Features illustrations by Swedish illustrator Johan Egerkrans

### Functions

* `Relative` and `Linear` layouts were prominently used for the page layouts
* `Activities` were created for each category and its questions
* `Radio buttons` are utilised to find the selected answer in the questions views
* The values gotten from the `radio buttons` are stored in a `Constants` folder, called in each question `Activity` and `incremented`. 
* `SharedPreferences` are called and used to store total score amounts and user names

## Concept Development

### Ideation

<img src="https://drive.google.com/uc?export=view&id=1q7TF1g-lGL1TS2mDQGnMi2HRiBzSj3Zi" />


### Wireframes

<img src = "https://drive.google.com/uc?export=view&id=1MDu5RRzGq8w-VXVJMkbMjNMaXdV04cqI"/>

### User Flow

<img src = "https://drive.google.com/uc?export=view&id=1W-8Uf2xAYXAD7wn5H5OOFGP0sdl6jy2n" />

## Development Process

### Implementation

<li>
      <p><u>Challenges:<u></p>
      <ul>
        <li><p>Learning and understanding the logic of Kotlin and how to layout designs was a fun challenge</p></li>
        <li><p>Learning to use shared preferences was a great learning curve</p></li>
        <li><p>Getting the total score and trying to increment the values proved to be more of a challnege than expected in the end</p></li>
      </ul>
    </li>
    
### Peer Reviews

<p>Response:</p>
      <ul>
        <li><p>Everyone had positive feedback with regards to the aesthetic and chosen theme of Norse Mythology</p></li>
        <li><p>The design was overall acceptable, a couple of changes here and there were reccomended for readability</p></li>
        <li><p>Overall the response was mostly positive</p></li>
      </ul>
    </li>
    <p>Alterations based on suggestions:</p>
      <ul>
        <li><p>I went and changed the font thickness in the question view texts to make it more readable for the user</p></li>
        <li><p>The thickness of the "Enter Name" button was adjusted for easier access</p></li>
        <li><p>The greeting text was also changed accordingly to better suit the theme of the app</p></li>
      </ul>
    </li>
    
## Demo Video

## Roadmap

See the [open issues](https://github.com/github_username/repo_name/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing
Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Author



<!-- LICENSE -->
## License
```
MIT License

Copyright (c) 2019 Igor Wojda

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and 
associated documentation files (the "Software"), to deal in the Software without restriction, including 
without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to 
the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial 
portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN 
NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
WHETHER IN AN ACTION OF  TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```



<!-- CONTACT -->
## Contact

Your Name - [@gradientnoodles](https://twitter.com/twitter_handle) - email

Project Link: [https://github.com/github_username/repo_name](https://github.com/github_username/repo_name)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* [Johan Egerkrans illustrations]()
* [Kotlin Documentation]()
* [Github]()





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/github_username
