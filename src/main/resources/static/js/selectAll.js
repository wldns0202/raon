function selectAll (obj)  {
    const checkboxes = document.getElementsByName('check');

    checkboxes.forEach((checkbox) => {
        checkbox.checked = obj.checked;
    })
}