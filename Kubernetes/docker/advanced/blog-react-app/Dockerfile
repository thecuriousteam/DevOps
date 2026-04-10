# select the base image -> always use the standard image from the docker hub
FROM node:22-alpine

# set the working directory for the build stage
WORKDIR /app

# copy the necessary files to the working directory
COPY package*.json ./

# install dependencies
RUN npm install

# copy the rest of code
COPY . ./

# build the application
RUN npm run build

# expose the port
EXPOSE 3000

# start the application
CMD ["npm", "start"]
