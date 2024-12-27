// script.js

// Get the modal elements
var loginModal = document.getElementById("loginModal");
var signupModal = document.getElementById("signupModal");

// Get the buttons that open the modals
var loginBtn = document.getElementById("loginBtn");
var signupBtn = document.getElementById("signupBtn");

// Get the <span> elements that close the modals
var loginClose = document.getElementById("loginClose");
var signupClose = document.getElementById("signupClose");

// Open login modal
if (loginBtn) {
    loginBtn.onclick = function() {
        loginModal.style.display = "block";
    }
}

// Open signup modal
if (signupBtn) {
    signupBtn.onclick = function() {
        signupModal.style.display = "block";
    }
}

// Close login modal
if (loginClose) {
    loginClose.onclick = function() {
        loginModal.style.display = "none";
    }
}

// Close signup modal
if (signupClose) {
    signupClose.onclick = function() {
        signupModal.style.display = "none";
    }
}

// Close modals if clicked outside the modal content
window.onclick = function(event) {
    if (event.target === loginModal) {
        loginModal.style.display = "none";
    }
    if (event.target === signupModal) {
        signupModal.style.display = "none";
    }
}