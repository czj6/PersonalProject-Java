'use strict'

/**
 * read file
 * @param {string} fileUrl
 */
function readFile(fileUrl) {
    let fs = require('fs');
    try {
        let data = fs.readFileSync(fileUrl, 'utf-8');
        return data;
    }
    catch (err) {
        console.log("file system can't read file, error msg follow:");
        console.log(err);
        return null;
    }
}

/**
 * write file
 * @param {string} fileUrl
 * @param {string} output
 */
function writeFile(fileUrl, output) {
    let fs = require('fs');
    try {
        fs.writeFileSync(fileUrl, output);
        return true;
    }
    catch (err) {
        console.log("file system can't write file, error msg follow:");
        console.log(err);
        return false;
    }
}

/**
 * count charactor quantity
 * @param {string} data 
 */
function countChar(data) {
    let charArrat = data.split("");
    console.log(charArrat);
    return charArrat.length;
}

/**
 * count word quantity
 * @param {string} data 
 */
function countWord(data) {
    return 2;
}

/**
 * count valid line
 * @param {string} data 
 */
function countValidLine(data) {
    return 0;
}

/**
 * return top 10 frequent words and frequency
 * @param {string} data 
 */
function countTopOccur(data) {
    return [
        {
            wrod: "a",
            frequency: 1,
        },
    ];
}

module.exports = { readFile, writeFile, countChar, countValidLine, countWord, countTopOccur };