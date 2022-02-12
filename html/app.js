'use strict'
const switcher = document.querySelector('.btn');
switcher.addEventListener('click', function() {
    document.body.classList.toggle('dark-theme')
    var fullPage = document.body.fullPage;
    if(fullPage == 'light-theme'){
        this.textContent = "Dark"
    }
    else if(fullPage == 'dark-theme'){
        this.textContent = "Lighting"
    }
    console.log('current class name: ' + fullPage);
});