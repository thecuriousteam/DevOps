# multi stage build
# builder stage
FROM node:22-alpine as builder

# set working directory
WORKDIR /app

# copy the necessary files to the working directory
COPY package*.json ./

# install necessary dependencies
RUN npm install

# copy all necessary remaining files
COPY . ./

# run the build command
RUN npm run build

# runner stage
FROM nginx:1.20

# remove default nginx configuration
RUN rm -rf /usr/share/nginx/html/*

# set working directory
WORKDIR /usr/share/nginx/html

# copy the build output to replace the default nginx contents
COPY --from=builder /app/build .

# expose the port
EXPOSE 80

# start nginx
CMD ["nginx","-g","daemon off;"]

