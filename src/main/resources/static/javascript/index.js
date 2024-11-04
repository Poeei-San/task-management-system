//To show task description summary
document.querySelectorAll('.dropdown-btn').forEach((button) => {
    button.addEventListener('click', (e) => {
        const dropdownContent = e.target.closest('.task-info-box').querySelector('.description-summary');
        dropdownContent.style.display = dropdownContent.style.display === 'block' ? 'none' : 'block';
    });
});

//Task Delete Comfirmation Box
var deleteConfirmationBox = document.querySelector(".task-delete-container");
var userDisableID = document.getElementById('userDisableId');

	if(userDisableID) {
		var deleteUrl = userDisableID.href;
	}
	function showUserDeleteContainer(id) {
		var userId = id.getAttribute('data-id');
		deleteConfirmationBox.classList.toggle('active');
		userDisableID.href = deleteUrl + userId;
	}

	function closeDeleteConfirmation() {
		deleteConfirmationBox.classList.remove('active');
}