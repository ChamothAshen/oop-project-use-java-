// Get the elements
const profileLink = document.getElementById("profile-link");
const popup = document.getElementById("popup");

// Show the popup when the image is clicked
profileLink.addEventListener("click", function (e) {
    e.preventDefault();
    popup.style.display = "block";
});

// Hide the popup when the user clicks outside of it
document.addEventListener("click", function (e) {
    if (e.target !== profileLink && e.target !== popup) {
        popup.style.display = "none";
    }
});
